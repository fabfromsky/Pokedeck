package com.pokedeck.imie.pokedeck.service;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Xml;

import com.pokedeck.imie.pokedeck.entity.Attack;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;
import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Fab on 21/07/2016.
 */
public class AttackService {

    public ArrayList<Attack> getAttacks(Context context){
        ArrayList<Attack> attacks= new ArrayList<>();
        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);

        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor cursor = null;
        try {
            cursor = db.query(true, "attack", new String[]{
                            "id",
                            "name",
                            "power",
                            "type"
                    },
                    null,
                    null,
                    null,
                    null,
                    "name",
                    null
            );
        } catch (SQLiteException e) {
            Log.e("attack service", "Error on query : " + e.getMessage());
        }

        if (cursor != null) {
            while (cursor.moveToNext()) {
                attacks.add(new Attack(cursor));
            }

            cursor.close();
        }

        db.close();

        return attacks;
    }

    public Attack getAttackById(Context context, int id){
        Attack attack = null;

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        String where = "id = " + String.valueOf(id);

        Cursor cursor = null;
        try {
            cursor = db.query(true, "attack", new String[]{
                            "id",
                            "name",
                            "power",
                            "type"
                    },
                    where,
                    null,
                    null,
                    null,
                    "name",
                    null
            );
        } catch (SQLiteException e) {
            Log.e("attack service", "Error on query : " + e.getMessage());
        }

        if (cursor != null) {
            if (cursor.moveToFirst())
                attack = new Attack(cursor);

            cursor.close();
        }

        db.close();

        return attack;

    }

    public ArrayList<Attack> getAttacksByType(Context context, TypeEnum type){
        ArrayList<Attack> attacks = new ArrayList<>();

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        String where = "type = " + String.valueOf(type.ordinal());
        Cursor cursor = null;
        try {
            cursor = db.query(true, "attack", new String[]{
                            "id",
                            "name",
                            "power",
                            "type"
                    },
                    null,
                    null,
                    null,
                    null,
                    "name",
                    null
            );
        } catch (SQLiteException e) {
            Log.e("attack service", "Error on query : " + e.getMessage());
        }

        if (cursor != null) {
            while (cursor.moveToNext()) {
                attacks.add(new Attack(cursor));
            }

            cursor.close();
        }

        db.close();

        return attacks;
    }
}
