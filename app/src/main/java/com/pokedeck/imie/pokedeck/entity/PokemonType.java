package com.pokedeck.imie.pokedeck.entity;

public class PokemonType {

    private Integer id;

    private String name;

    private Integer speed;

    private Float attack;

    private Float attackSpe;

    private Float defense;

    private Float defenseSpe;

    private Integer pvMax;

    private Integer pvMin;

    private Integer idPokedex;

    private Type type;

    public PokemonType() {
    }

    public PokemonType(Integer id, String name, Integer speed, Float attack, Float attackSpe, Float defense, Float defenseSpe, Integer pvMax, Integer pvMin, Integer idPokedex, Type type) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.attack = attack;
        this.attackSpe = attackSpe;
        this.defense = defense;
        this.defenseSpe = defenseSpe;
        this.pvMax = pvMax;
        this.pvMin = pvMin;
        this.idPokedex = idPokedex;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Float getAttack() {
        return attack;
    }

    public void setAttack(Float attack) {
        this.attack = attack;
    }

    public Float getAttackSpe() {
        return attackSpe;
    }

    public void setAttackSpe(Float attackSpe) {
        this.attackSpe = attackSpe;
    }

    public Float getDefense() {
        return defense;
    }

    public void setDefense(Float defense) {
        this.defense = defense;
    }

    public Float getDefenseSpe() {
        return defenseSpe;
    }

    public void setDefenseSpe(Float defenseSpe) {
        this.defenseSpe = defenseSpe;
    }

    public Integer getPvMax() {
        return pvMax;
    }

    public void setPvMax(Integer pvMax) {
        this.pvMax = pvMax;
    }

    public Integer getPvMin() {
        return pvMin;
    }

    public void setPvMin(Integer pvMin) {
        this.pvMin = pvMin;
    }

    public Integer getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(Integer idPokedex) {
        this.idPokedex = idPokedex;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}