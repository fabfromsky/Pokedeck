package com.pokedeck.imie.pokedeck.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/**
 * Created by Alex on 22/06/2016.
 */
public class MusicController {
    public static MediaPlayer mediaPlayer;

    public static void setMusic(Context context, int music) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(context, music);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        Log.i("MusicController", "Music has changed !");
    }
}
