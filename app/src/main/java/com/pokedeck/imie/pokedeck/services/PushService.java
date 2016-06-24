package com.pokedeck.imie.pokedeck.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class PushService extends Service {

    public Binder binder = new PushServiceBinder();

    public PushService() {
    }

    public String message(){
        return "La fleur en bouquet fanne... mais jamais ne renait!!";
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Thread thread = Thread.currentThread();
        Toast.makeText(PushService.this, "Start service create on thread:" + thread.getId(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int result = super.onStartCommand(intent, flags, startId);
        Thread thread = Thread.currentThread();
        Toast.makeText(PushService.this, "Service command start on thread:" + thread.getId(), Toast.LENGTH_SHORT).show();
        return result;
    }

    @Override
    public void onDestroy() {
        Thread thread = Thread.currentThread();
        Toast.makeText(PushService.this, "This service destroyed on thread:" + thread.getId(), Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    public class PushServiceBinder extends Binder{

        public PushService getPushService(){
            return PushService.this;
        }
    }
}
