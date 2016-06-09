package com.pokedeck.imie.pokedeck.entity;

import java.util.ArrayList;

public class Pokemon extends PokemonType {

    private Integer id;

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

    public Pokemon(Integer id, String nickname, Integer pv, Float coeffAttack, Float coeffDefense, Integer idPokedeck, ArrayList<Attack> attacks) {
        this.id = id;
        this.nickname = nickname;
        this.pv = pv;
        this.coeffAttack = coeffAttack;
        this.coeffDefense = coeffDefense;
        this.idPokedeck = idPokedeck;
        this.attacks = attacks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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