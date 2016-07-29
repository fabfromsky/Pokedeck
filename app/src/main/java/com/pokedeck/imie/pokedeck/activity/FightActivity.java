package com.pokedeck.imie.pokedeck.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pokedeck.imie.pokedeck.R;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        TextView textView = (TextView) findViewById(R.id.textViewFight);

        // On récupère l'email de l'utilisateur que l'on souhaite affronter
        Intent intent = getIntent();
        String name = intent.getStringExtra("userEmail");
        assert textView != null;
        textView.setText(name);

        onResume();
    }
}
