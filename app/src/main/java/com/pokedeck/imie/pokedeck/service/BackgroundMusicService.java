package com.pokedeck.imie.pokedeck.service;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import com.pokedeck.imie.pokedeck.R;

public class BackgroundMusicService extends Service {
    MediaPlayer player;

    public IBinder onBind(Intent arg0) {
        Log.i("BackgroundMusicService", "onBind() called !");
        return null;
    }

    @Override
    public void onCreate() {
        Log.i("BackgroundMusicService", "onCreate() called !");
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.opening);
        player.setLooping(true); // Set looping
        player.setVolume(100, 100);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("BackgroundMusicService", "onStartCommand() called !");
        player.start();
        return 1;
    }

    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }

    public void onPause() {

    }

    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {

    }
}