package com.pokedeck.imie.pokedeck.activity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pokedeck.imie.pokedeck.R;

import java.util.ArrayList;
import java.util.List;

public class PokedeckActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // On verifie si le user est authentifie
        loginCheck();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedeck);

        List<String> listValues = new ArrayList<String>();
        listValues.add("Android");
        listValues.add("iOS");
        listValues.add("Symbian");
        listValues.add("Blackberry");
        listValues.add("Windows Phone");

        // initiate the listadapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                R.layout.listitem_pokedeck, R.id.listText, listValues);

        // assign the list adapter
        setListAdapter(myAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Log.i("PokedeckActivity", "Vous avez cliqué sur l'élément id = " + position);
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
