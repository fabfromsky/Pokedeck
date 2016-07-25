package com.pokedeck.imie.pokedeck.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Alexandre on 10/06/2016.
 */
public class LocalSQLiteOpenHelper extends SQLiteOpenHelper {

    static String DB_NAME = "pokedeck.db";
    static int DB_VERSION = 1;

    public LocalSQLiteOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreatePokemonTable = "CREATE TABLE pokemon (id INTEGER PRIMARY KEY," +
                "nickname TEXT, pv NUMERIC, speed NUMERIC, attack NUMERIC, attackSpe NUMERIC," +
                "defense NUMERIC, defenseSpe NUMERIC, idPokedeck NUMERIC, pokemonType NUMERIC," +
                "attack1 NUMERIC, attack2 NUMERIC, attack3 NUMERIC, attack4 NUMERIC);";

        String sqlCreateAttackTable = "CREATE TABLE attack (id INTEGER PRIMARY KEY," +
                "name TEXT, power NUMERIC, type NUMERIC);";


        db.beginTransaction();

        try {
            db.execSQL(sqlCreatePokemonTable);
            db.execSQL(sqlCreateAttackTable);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            Log.e("LocalSQLiteOpenHelper", e.getMessage());
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for (int i = oldVersion; i < newVersion; i++) {
            int versionToUpdate = i + 1;

            if (versionToUpdate == 2) {
                // Code pour mettre la bdd en version 2
            } else if (versionToUpdate == 3) {
                // Code pour mettre la bdd en version 3
            }
            // [...]
        }
    }
}
