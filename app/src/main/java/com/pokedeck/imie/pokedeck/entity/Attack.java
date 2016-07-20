package com.pokedeck.imie.pokedeck.entity;

import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;

public class Attack {

    private Integer id;

    private String name;

    private Integer power;

    private TypeEnum type;

    public Attack() {
    }

    public Attack(Integer id, String name, Integer power, TypeEnum type) {
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

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
}