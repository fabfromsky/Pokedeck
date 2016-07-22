package com.pokedeck.imie.pokedeck.entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;
import com.pokedeck.imie.pokedeck.service.AttackService;

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

    private Attack attack1;

    private Attack attack2;

    private Attack attack3;

    private Attack attack4;

    private PokemonTypeEnum pokemonType;

    public Pokemon() {
    }

    public Pokemon(Long id, String nickname, Integer pv, Integer attack, Integer attackSpe,
                   Integer defense, Integer defenseSpe, Integer speed, Integer idPokedeck,
                   Attack attack1, Attack attack2, Attack attack3, Attack attack4,
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
        AttackService atkService = new AttackService();
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
        /*values.put("attack1", this.attack1.getId());
        values.put("attack2", this.attack2.getId());
        values.put("attack3", this.attack3.getId());
        values.put("attack4", this.attack4.getId());*/
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

    public Attack getAttack1() {
        return attack1;
    }

    public void setAttack1(Attack attack1) {
        this.attack1 = attack1;
    }

    public Attack getAttack2() {
        return attack2;
    }

    public void setAttack2(Attack attack2) {
        this.attack2 = attack2;
    }

    public Attack getAttack3() {
        return attack3;
    }

    public void setAttack3(Attack attack3) {
        this.attack3 = attack3;
    }

    public Attack getAttack4() {
        return attack4;
    }

    public void setAttack4(Attack attack4) {
        this.attack4 = attack4;
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