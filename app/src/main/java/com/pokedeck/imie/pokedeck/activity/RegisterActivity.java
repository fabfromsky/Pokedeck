package com.pokedeck.imie.pokedeck.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.controller.QueueController;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {
    private Button mCancel, mProceed;
    private TextView mEmailView, mPasswordView, mConfirmView, mNameView;
    private View mProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mCancel = (Button) findViewById(R.id.buttonRegisterCancel);
        mProceed = (Button) findViewById(R.id.buttonRegisterProceed);

        mNameView = (TextView) findViewById(R.id.editTextRegisterName);
        mEmailView = (TextView) findViewById(R.id.editTextRegisterEmail);
        mPasswordView = (TextView) findViewById(R.id.editTextRegisterPassword);
        mConfirmView = (TextView) findViewById(R.id.editTextRegisterConfirm);

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptRegister();
            }
        });

        mProgressView = findViewById(R.id.register_progress);
    }

    private void attemptRegister() {
        // Reset errors.
        mEmailView.setError(null);
        mPasswordView.setError(null);
        mConfirmView.setError(null);

        // Store values at the time of the login attempt.
        String name = mNameView.getText().toString();
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a non empty name
        if (TextUtils.isEmpty(name)) {
            mNameView.setError("Cannot be empty");
            focusView = mNameView;
            cancel = true;
        }

        // Check for a valid mPassword, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            mPasswordView.setError(getString(R.string.error_invalid_password));
            focusView = mPasswordView;
            cancel = true;
        }

        // Check if password and confirm are the same.
        String passwordEntered = mPasswordView.getText().toString();
        String confirmEntered = mConfirmView.getText().toString();

        if (!passwordEntered.equals(confirmEntered)) {
            Log.i("RegisterActivity", "attemptRegister : passwordEntered {" + passwordEntered + "} and confirmEntered {" + confirmEntered + "} are different.");

            mConfirmView.setError("Les deux mots de passe ne sont pas identiques");
            focusView = mConfirmView;
            cancel = true;
        }

        // Check for a valid mEmail address.
        if (TextUtils.isEmpty(email)) {
            mEmailView.setError(getString(R.string.error_field_required));
            focusView = mEmailView;
            cancel = true;
        } else if (!isEmailValid(email)) {
            mEmailView.setError(getString(R.string.error_invalid_email));
            focusView = mEmailView;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            performUserRegisterAttempt(name, email, password);
        }
    }

    private void performUserRegisterAttempt(final String name, final String email, String password) {
        mProgressView.setVisibility(View.VISIBLE);
        mProgressView.animate().setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime)).alpha(1).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mProgressView.setVisibility(View.VISIBLE);
            }
        });

        String url = getResources().getString(R.string.baseURL) + "/api/user/new";

        Log.i("RegisterActivity", "performUserRegisterAttempt - url = " + url);

        JSONObject jsonRequest = null;

        try {
            String jsonString = "{\"username\":\"" + name + "\",\"email\":\"" + email + "\",\"password\":\"" + password + "\",\"enabled\":\"1\"}";

            jsonRequest = new JSONObject(jsonString);

            Log.i("UserRegisterTask", "jsonString = " + jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // We send the reques and fetch the response
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, url, jsonRequest, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String data;
                        try {
                            data = response.getString("response");

                            Log.i("RegisterActivity", "fetchData - onResponse : data = " + data);

                            if (data.equals("User successfully created")) {
                                // We save authentication.
                                SharedPreferences sharedPreferences = getSharedPreferences("com.imie.pokedeck.prefs", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("mName", name);
                                editor.putString("mEmail", email);

                                // Do commit() instead of apply() because it has to be done before to continue.
                                editor.apply();

                                finish();
                            }
                        } catch (JSONException e) {
                            Log.e("RegisterActivity", "onErrorResponse - Error: " + e.getMessage());
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        mProgressView.setVisibility(View.GONE);
                        mProgressView.animate().setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime)).alpha(0).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                mProgressView.setVisibility(View.GONE);
                            }
                        });

                        // Case when it fails
                        Log.e("RegisterActivity", "onErrorResponse - Error: " + error.toString());

                        Toast toast = Toast.makeText(getApplicationContext(), "Une erreur est survenue", Toast.LENGTH_LONG);
                        toast.show();
                    }
                });

        QueueController.getInstance().addToRequestQueue(jsonObjectRequest);
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }
}