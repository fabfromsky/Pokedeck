package com.pokedeck.imie.pokedeck.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pokedeck.imie.pokedeck.R;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        onResume();
    }
}
