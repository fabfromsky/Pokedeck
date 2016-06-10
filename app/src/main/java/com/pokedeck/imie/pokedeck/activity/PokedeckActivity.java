package com.pokedeck.imie.pokedeck.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.entity.Pokedeck;
import com.pokedeck.imie.pokedeck.entity.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokedeckActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // On verifie si le user est authentifie
        loginCheck();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedeck);

        listView = (ListView) findViewById(R.id.pokedeck_list);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Pokemon> pokemons = Pokedeck.getPokemons(this);
    }

    private void loginCheck() {
        SharedPreferences sharedPreferences = getSharedPreferences("com.imie.pokedeck.prefs", Context.MODE_PRIVATE);
        if (!sharedPreferences.contains("email")) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else {
            Log.i("MainPageActivity", "loginCheck - User has already logged in");
        }
    }
}
