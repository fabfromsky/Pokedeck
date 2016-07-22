package com.pokedeck.imie.pokedeck.entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.enumeration.AttackEnum;
import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

public class Pokemon {

    private Long id;

    private String nickname;

    private Integer pv;

    private Integer attack;

    private Integer attackSpe;

    private Integer defense;

    private Integer defenseSpe;

    private Integer speed;

    private Integer idPokedeck;

    private AttackEnum attack1;

    private AttackEnum attack2;

    private AttackEnum attack3;

    private AttackEnum attack4;

    private PokemonTypeEnum pokemonType;

    public Pokemon() {
    }

    public Pokemon(Long id, String nickname, Integer pv, Integer attack, Integer attackSpe,
                   Integer defense, Integer defenseSpe, Integer speed, Integer idPokedeck,
                   AttackEnum attack1, AttackEnum attack2, AttackEnum attack3, AttackEnum attack4,
                   PokemonTypeEnum pokemonType) {
        this.id = id;
        this.nickname = nickname;
        this.pv = pv;
        this.attack = attack;
        this.attackSpe = attackSpe;
        this.defense = defense;
        this.defenseSpe = defenseSpe;
        this.speed = speed;
        this.idPokedeck = idPokedeck;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
        this.pokemonType = pokemonType;
    }

    public Pokemon(Cursor cursor) {
        this.id = cursor.getLong(cursor.getColumnIndex("id"));
        this.nickname = cursor.getString(cursor.getColumnIndex("nickname"));
        this.pv = cursor.getInt(cursor.getColumnIndex("pv"));
        this.attack = cursor.getInt(cursor.getColumnIndex("attack"));
        this.attackSpe = cursor.getInt(cursor.getColumnIndex("attackSpe"));
        this.defense = cursor.getInt(cursor.getColumnIndex("defense"));
        this.defenseSpe = cursor.getInt(cursor.getColumnIndex("defenseSpe"));
        this.speed = cursor.getInt(cursor.getColumnIndex("speed"));
        this.idPokedeck = cursor.getInt(cursor.getColumnIndex("idPokedeck"));
        this.pokemonType = PokemonTypeEnum.values()[cursor.getInt(cursor.getColumnIndex("pokemonType"))];
        this.attack1 = AttackEnum.values()[cursor.getInt(cursor.getColumnIndex("attack1"))];
        this.attack2 = AttackEnum.values()[cursor.getInt(cursor.getColumnIndex("attack2"))];
        this.attack3 = AttackEnum.values()[cursor.getInt(cursor.getColumnIndex("attack3"))];
        this.attack4 = AttackEnum.values()[cursor.getInt(cursor.getColumnIndex("attack4"))];
    }

    public void insert(Context context) {
        ContentValues values = new ContentValues();
        values.put("nickname", this.nickname);
        values.put("pv", this.pv);
        values.put("attack", this.attack);
        values.put("attackSpe", this.attackSpe);
        values.put("defense", this.defense);
        values.put("defenseSpe", this.defenseSpe);
        values.put("speed", this.speed);
        values.put("idPokedeck", this.idPokedeck);
        values.put("attack1", this.attack1.ordinal());
        values.put("attack2", this.attack2.ordinal());
        values.put("attack3", this.attack3.ordinal());
        values.put("attack4", this.attack4.ordinal());
        values.put("pokemonType", this.pokemonType.ordinal());

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

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getAttackSpe() {
        return attackSpe;
    }

    public void setAttackSpe(Integer attackSpe) {
        this.attackSpe = attackSpe;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getDefenseSpe() {
        return defenseSpe;
    }

    public void setDefenseSpe(Integer defenseSpe) {
        this.defenseSpe = defenseSpe;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getIdPokedeck() {
        return idPokedeck;
    }

    public PokemonTypeEnum getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonTypeEnum pokemonType) {
        this.pokemonType = pokemonType;
    }

    public void setIdPokedeck(Integer idPokedeck) {
        this.idPokedeck = idPokedeck;
    }

    public AttackEnum getAttack1() {
        return attack1;
    }

    public void setAttack1(AttackEnum attack1) {
        this.attack1 = attack1;
    }

    public AttackEnum getAttack2() {
        return attack2;
    }

    public void setAttack2(AttackEnum attack2) {
        this.attack2 = attack2;
    }

    public AttackEnum getAttack3() {
        return attack3;
    }

    public void setAttack3(AttackEnum attack3) {
        this.attack3 = attack3;
    }

    public AttackEnum getAttack4() {
        return attack4;
    }

    public void setAttack4(AttackEnum attack4) {
        this.attack4 = attack4;
    }

    /**
     * Execute the selected attack on target pokemon.
     *
     * @param attack
     * @param target
     */
    private void attack(AttackEnum attack, Pokemon target) {
    }

}