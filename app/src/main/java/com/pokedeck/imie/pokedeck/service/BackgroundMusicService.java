package com.pokedeck.imie.pokedeck.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import com.pokedeck.imie.pokedeck.R;

public class BackgroundMusicService extends Service {
    private static BackgroundMusicService backgroundMusicServiceInstance;
    MediaPlayer player;

    public static BackgroundMusicService getInstance() {
        return BackgroundMusicService.backgroundMusicServiceInstance;
    }

    public IBinder onBind(Intent arg0) {
        Log.i("BackgroundMusicService", "onBind() called !");
        return null;
    }

    @Override
    public void onCreate() {
        Log.i("BackgroundMusicService", "onCreate() called !");
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.opening);
        player.setLooping(true);
        player.setVolume(100, 100);

        backgroundMusicServiceInstance = this;
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