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
import com.pokedeck.imie.pokedeck.service.BackgroundMusicService;

public class OnlineUsersActivity extends AppCompatActivity {

    ListView listView;
    boolean isLogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // As it's the main activity it's here we start BackgroundMusicService
        Intent svc = new Intent(this, BackgroundMusicService.class);
        startService(svc);

        // Check if user has already logged in
        isLogged = loginCheck();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_users);

        listView = (ListView) findViewById(R.id.user_list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startViewFightActivity(id);
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
        if (isLogged)
            super.onResume();
        else
            loginCheck();
            super.onResume();
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

    private void startViewFightActivity(long userId) {
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("userId", userId);
        startActivity(intent);
    }
}
