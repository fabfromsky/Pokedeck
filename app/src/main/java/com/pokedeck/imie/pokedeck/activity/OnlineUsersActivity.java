package com.pokedeck.imie.pokedeck.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.adapter.UserAdapter;
import com.pokedeck.imie.pokedeck.entity.User;
import com.pokedeck.imie.pokedeck.service.BackgroundMusicService;

import java.util.ArrayList;

public class OnlineUsersActivity extends AppCompatActivity {

    ListView listView;
    boolean isLogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // As it's the main activity it is where we start BackgroundMusicService.
        Intent svc = new Intent(this, BackgroundMusicService.class);
        startService(svc);

        // Check if user has already logged in.
        isLogged = loginCheck();

        // TODO : Comment next line it's an authentication bypass
        isLogged = true;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_users);

        listView = (ListView) findViewById(R.id.user_list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User selectedUser = (User) listView.getItemAtPosition(position);
                startViewFightActivity(selectedUser.getEmail());
            }
        });

        Button goPokedeckButton = (Button) findViewById(R.id.goPokedeck);
        assert goPokedeckButton != null;
        goPokedeckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPokedeck();
            }
        });
    }

    @Override
    protected void onResume() {
        // On vérifie que l'utilisateur est connecté.
        if (isLogged) {
            super.onResume();
            ArrayList<User> users = User.getOnlineUsers(this);
            UserAdapter userAdapter = new UserAdapter(this, users);
            listView.setAdapter(userAdapter);
        } else {
            loginCheck();
            super.onResume();
        }
    }

    private void goToPokedeck() {
        Intent intent = new Intent(getApplicationContext(), PokedeckActivity.class);
        startActivity(intent);
    }

    private boolean loginCheck() {
        SharedPreferences sharedPreferences = getSharedPreferences("com.imie.pokedeck.prefs", Context.MODE_PRIVATE);

        if (!sharedPreferences.contains("mEmail")) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

            return false;
        } else {
            Log.i("MainPageActivity", "loginCheck - User has already logged in");

            return true;
        }
    }

    private void startViewFightActivity(String userEmail) {
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("userEmail", userEmail);
        startActivity(intent);
    }
}
