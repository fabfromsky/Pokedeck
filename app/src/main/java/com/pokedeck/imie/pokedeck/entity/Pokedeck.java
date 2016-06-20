package com.pokedeck.imie.pokedeck.entity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

import java.util.ArrayList;

public class Pokedeck {

    private Long id;

    private static ArrayList<Pokemon> pokemons;

    public Pokedeck() {
    }

    public Pokedeck(Long id, ArrayList<Pokemon> pokemons) {
        this.id = id;
        Pokedeck.pokemons = pokemons;
    }

    public static ArrayList<Pokemon> getPokemons(Context context) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);

        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor cursor = null;
        try {
            cursor = db.query(true, "pokemon", new String[]{
                            "id",
                            "nickname",
                            "pv"
                    },
                    null,
                    null,
                    null,
                    null,
                    "nickname",
                    null
            );
        } catch (SQLiteException e) {
            Log.e("Pokedeck", "Error on query : " + e.getMessage());
        }

        if (cursor != null) {
            while (cursor.moveToNext()) {
                pokemons.add(new Pokemon(cursor));
            }

            cursor.close();
        }

        db.close();

        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        Pokedeck.pokemons = pokemons;
    }

    public Pokemon getPokemon(Context context, Long id) {
        Pokemon pokemon = null;

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        String where = "id = " + String.valueOf(id);

        Cursor cursor = db.query(true, "pokemon", new String[]{
                        "id",
                        "nickname",
                        "pv"
                },
                where,
                null,
                null,
                null,
                "nickname",
                null
        );

        if (cursor.moveToFirst())
            pokemon = new Pokemon(cursor);

        cursor.close();
        db.close();

        return pokemon;
    }

    public void addPokemon(Context context, Pokemon pokemon) {
        ContentValues values = new ContentValues();
        values.put("nickname", pokemon.getNickname());
        values.put("pv", pokemon.getPv());

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getWritableDatabase();
        pokemon.setId(db.insert("pokemon", null, values));
        db.close();
    }

    public void removePokemon(Context context) {
        String where = "id = ?";
        String[] whereArgs = new String[1];
        whereArgs[0] = String.valueOf(this.id);

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getWritableDatabase();

        db.delete("pokemon", where, whereArgs);
        db.close();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}