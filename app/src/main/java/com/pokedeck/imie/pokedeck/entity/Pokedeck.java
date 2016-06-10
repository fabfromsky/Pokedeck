package com.pokedeck.imie.pokedeck.entity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

import java.util.ArrayList;

public class Pokedeck {

    private Integer id;

    private static ArrayList<Pokemon> pokemons;

    public Pokedeck() {
    }

    public Pokedeck(Integer id, ArrayList<Pokemon> pokemons) {
        this.id = id;
        Pokedeck.pokemons = pokemons;
    }



    public static ArrayList<Pokemon> getPokemons(Context context) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.query(true, "pokemon", new String[]{
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

        if (cursor.getCount() == 0){
            Pokemon pokemon = new Pokemon();
            pokemon.setPv(100);
            pokemon.setNickname("Pikachu");

            pokemon.insert(context);

            pokemons.add(pokemon);
            pokemons.add(pokemon);
            pokemons.add(pokemon);
        }


        while (cursor.moveToNext()) {
            pokemons.add(new Pokemon(cursor));
        }

        cursor.close();
        db.close();

        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        Pokedeck.pokemons = pokemons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}