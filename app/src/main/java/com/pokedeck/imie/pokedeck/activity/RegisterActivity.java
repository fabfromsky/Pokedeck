package com.pokedeck.imie.pokedeck.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.controller.NetworkController;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {
    Button cancel, proceed;
    TextView mEmail, mPassword, mConfirm;

    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
    private UserRegisterTask mRegisterTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Gets view elements
        cancel = (Button) findViewById(R.id.buttonRegisterCancel);
        proceed = (Button) findViewById(R.id.buttonRegisterProceed);
        mEmail = (TextView) findViewById(R.id.editTextRegisterEmail);
        mPassword = (TextView) findViewById(R.id.editTextRegisterPassword);
        mConfirm = (TextView) findViewById(R.id.editTextRegisterConfirm);

        // Set button action
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptRegister();
            }
        });
    }

    private void attemptRegister() {
        if (mRegisterTask != null)
            return;

        // Reset errors.
        mEmail.setError(null);
        mPassword.setError(null);
        mConfirm.setError(null);

        // Store values at the time of the login attempt.
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a valid mPassword, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            mPassword.setError(getString(R.string.error_invalid_password));
            focusView = mPassword;
            cancel = true;
        }

        // Check if password and confirmed are the same.
        if (!mPassword.getText().equals(mConfirm.getText())) {
            mConfirm.setError(getString(R.string.error_incorrect_password));
            focusView = mConfirm;
            cancel = true;
        }

        // Check for a valid mEmail address.
        if (TextUtils.isEmpty(email)) {
            mEmail.setError(getString(R.string.error_field_required));
            focusView = mEmail;
            cancel = true;
        } else if (!isEmailValid(email)) {
            mEmail.setError(getString(R.string.error_invalid_email));
            focusView = mEmail;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // perform the user login attempt.
            mRegisterTask = new UserRegisterTask(email, password);
            mRegisterTask.execute((Void) null);
        }
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }

    /**
     * Represents an asynchronous registration task used to register
     * the user.
     */
    public class UserRegisterTask extends AsyncTask<Void, Void, Boolean> {
        String data = null;
        private final String mEmail;
        private final String mPassword;

        UserRegisterTask(String email, String password) {
            mEmail = email;
            mPassword = password;
        }

        @SuppressLint("CommitPrefEdits")
        @Override
        protected Boolean doInBackground(Void... params) {
            Log.i("UserLoginTask", "doInBackground : mEmail = " + mEmail + "; mPassword = " + mPassword);

            // Try to get authentified by the Symfo.
            fetchData(new DataCallback() {
                @Override
                public void onSuccess(JSONObject result) {
                    try {
                        data = result.getString("response");
                        Log.i("UserLoginTask", "fetchData - onSuccess : data = " + data);
                    } catch (JSONException e) {
                        Log.e("UserLoginTask", "fetchData - onSuccess : Error " + e.getMessage());
                    }
                }
            });

            // As if it were synchronous, wait for the response. Not so proud about that.
            int i = 0;
            while (data == null && i < 1000) {
                synchronized (this) {
                    try {
                        this.wait(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                i++;
            }

            if (data != null) {
                if (data.equals("Successfully logged in")) {
                    // We save authentication.
                    SharedPreferences sharedPreferences = getSharedPreferences("com.imie.pokedeck.prefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("mEmail", mEmail);

                    // Do commit() instead of apply() because it has to be done before to continue.
                    editor.commit();

                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override
        protected void onPostExecute(final Boolean success) {
            mRegisterTask = null;

            if (success) {
                // Finish current activity shows back the main activity.
                finish();
            } else {
                mPassword.setError(getString(R.string.error_incorrect_password));
                mPassword.requestFocus();
            }
        }

        @Override
        protected void onCancelled() {
            mRegisterTask = null;
        }

        public void fetchData(final DataCallback callback) {
            String url = getResources().getString(R.string.baseURL) + "/api/user/new";
            JSONObject jsonRequest = null;

            try {
                String jsonString = "{\"security_login\": {\"username\": \"" +
                        mEmail + "\",\"plainPassword\": \"" +
                        mPassword + "\"}}";

                jsonRequest = new JSONObject(jsonString);

                Log.i("UserLoginTask", "jsonString = " + jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            // We send the reques and fetch the response
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                    (Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            // Case when everything goes well
                            assert response != null;
                            Log.i("UserLoginTask", "jsonObjectRequest - response = " + response.toString());

                            callback.onSuccess(response);
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // Case when it fails
                            Log.e("UserLoginTask", "jsonObjectRequest - Error: " + error.getMessage());
                        }
                    });
            NetworkController.getInstance().addToRequestQueue(jsonObjectRequest);
        }
    }

    public interface DataCallback {
        void onSuccess(JSONObject result);
    }
}
