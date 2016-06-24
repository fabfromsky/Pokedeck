package com.pokedeck.imie.pokedeck.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.entity.Pokemon;
import com.pokedeck.imie.pokedeck.services.PushService;

public class DatabaseActivity extends AppCompatActivity {

    protected Firebase firebase;
    protected FirebaseDatabase database;
    protected PushService serviceProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Firebase.setAndroidContext(DatabaseActivity.this);
        firebase = new Firebase("https://pokedeck-8545b.firebaseio.com/");

        database = FirebaseDatabase.getInstance();

        final DatabaseReference pokemon = database.getReference("pokemon").child("pokemon25");
        pokemon.addValueEventListener(new com.google.firebase.database.ValueEventListener(){

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Pokemon pokemonObj = new Pokemon((long) 1, dataSnapshot.child("name").getValue().toString(), (int) dataSnapshot.child("pv").getValue(), null, null, null, null);
                Toast.makeText(DatabaseActivity.this, pokemonObj.getPv(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        setContentView(R.layout.activity_database);
    }
}
