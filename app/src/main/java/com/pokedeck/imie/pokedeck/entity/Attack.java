package com.pokedeck.imie.pokedeck.entity;

public class Attack {

    private Integer id;

    private String name;

    private Integer power;

    private Type type;

    public Attack() {
    }

    public Attack(Integer id, String name, Integer power, Type type) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}