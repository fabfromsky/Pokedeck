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
        String sqlFillTable = "CREATE TABLE pokemon (id INTEGER PRIMARY KEY," +
                "nickname TEXT, pv NUMERIC" +
                ");";

        db.beginTransaction();

        try {
            db.execSQL(sqlFillTable);
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
