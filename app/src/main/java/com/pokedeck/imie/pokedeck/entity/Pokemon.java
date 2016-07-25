package com.pokedeck.imie.pokedeck.entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

import java.util.ArrayList;

public class Pokemon extends PokemonType {

    private Long id;

    private String nickname;

    /**
     * Is randomly set on pokemon creation between pokemonType's max and min PV.
     */
    private Integer pv;

    private Float coeffAttack;

    private Float coeffDefense;

    private Integer idPokedeck;

    private ArrayList<Attack> attacks;

    public Pokemon() {
    }

    public Pokemon(Long id, String nickname, Integer pv, Float coeffAttack, Float coeffDefense, Integer idPokedeck, ArrayList<Attack> attacks) {
        this.id = id;
        this.nickname = nickname;
        this.pv = pv;
        this.coeffAttack = coeffAttack;
        this.coeffDefense = coeffDefense;
        this.idPokedeck = idPokedeck;
        this.attacks = attacks;
    }

    public Pokemon(Cursor cursor) {
        this.id = cursor.getLong(cursor.getColumnIndex("id"));
        this.nickname = cursor.getString(cursor.getColumnIndex("nickname"));
        this.pv = cursor.getInt(cursor.getColumnIndex("pv"));
    }

    public void insert(Context context) {
        ContentValues values = new ContentValues();
        values.put("nickname", this.nickname);
        values.put("pv", this.pv);

        LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getWritableDatabase();
        this.id = db.insert("pokemon", null, values);
        db.close();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Float getCoeffAttack() {
        return coeffAttack;
    }

    public void setCoeffAttack(Float coeffAttack) {
        this.coeffAttack = coeffAttack;
    }

    public Float getCoeffDefense() {
        return coeffDefense;
    }

    public void setCoeffDefense(Float coeffDefense) {
        this.coeffDefense = coeffDefense;
    }

    public Integer getIdPokedeck() {
        return idPokedeck;
    }

    public void setIdPokedeck(Integer idPokedeck) {
        this.idPokedeck = idPokedeck;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }

    /**
     * Execute the selected attack on target pokemon.
     *
     * @param attack
     * @param target
     */
    private void attack(Attack attack, Pokemon target) {
    }

}