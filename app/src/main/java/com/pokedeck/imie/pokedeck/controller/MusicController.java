package com.pokedeck.imie.pokedeck.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/**
 * Created by Alex on 22/06/2016.
 */
public class MusicController {
    public static MediaPlayer mediaPlayer = null;
    private static int currentPosition = 0;

    public static void setMusic(Context context, int music) {
        currentPosition = 0;

        if (null != mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        mediaPlayer = MediaPlayer.create(context, music);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        Log.i("MusicController", "Music has changed !");
    }

    /**
     * Stops the music and store where it is.
     */
    public static void pause() {
        if (null != mediaPlayer) {
            if (!mediaPlayer.isPlaying()) {
                currentPosition = mediaPlayer.getCurrentPosition();
                mediaPlayer.pause();

                Log.i("MusicController", "Music paused !");
            }
        }
    }

    /**
     * Start back the music from where it were.
     */
    public static void resume() {
        if (null != mediaPlayer) {
            mediaPlayer.seekTo(currentPosition);

            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();

                Log.i("MusicController", "Music resumed !");
            }
        }
    }
}
