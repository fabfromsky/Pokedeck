package com.pokedeck.imie.pokedeck.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.controller.MusicController;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        onResume();
    }

    @Override
    protected void onResume() {
        super.onResume();

        MusicController.setMusic(this, R.raw.battle);
    }

    @Override
    protected void onPause() {
        super.onPause();

        MusicController.mediaPlayer.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        onPause();
    }
}
