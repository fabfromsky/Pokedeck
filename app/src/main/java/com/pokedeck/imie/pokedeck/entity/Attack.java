package com.pokedeck.imie.pokedeck.entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;
import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

public class Attack {

    private Long id;

    private String name;

    private Integer power;

    private TypeEnum type;

    public Attack() {
    }

    public Attack(Long id, String name, Integer power, TypeEnum type) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public Attack(Cursor cursor) {
        this.id = cursor.getLong(cursor.getColumnIndex("id"));
        this.name = cursor.getString(cursor.getColumnIndex("name"));
        this.type = TypeEnum.values()[cursor.getInt(cursor.getColumnIndex("type"))];
    }

    public void insert(Context context) {
        ContentValues values = new ContentValues();
        values.put("name", this.name);
        values.put("power", this.power);
        values.put("type", this.type.ordinal());

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getWritableDatabase();
        this.id = db.insert("attack", null, values);
        db.close();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
}