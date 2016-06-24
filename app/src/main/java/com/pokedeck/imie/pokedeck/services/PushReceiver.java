package com.pokedeck.imie.pokedeck.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Fab on 23/06/2016.
 */
public class PushReceiver extends BroadcastReceiver {

    public PushReceiver(){}

    @Override
    public void onReceive(Context context, Intent intent) {
    Intent serviceIntent = new Intent(context, PushService.class);
        Toast.makeText(context, "Launch service from broadcast receiver", Toast.LENGTH_SHORT).show();
        context.startService(serviceIntent);
    }
}
