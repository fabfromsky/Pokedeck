package com.pokedeck.imie.pokedeck.entity;

public class Type {

    private Integer id;

    private String name;

    private Type weakAgainst;

    private Type strongAgainst;

    public Type() {
    }

    public Type(Integer id, String name, Type weakAgainst, Type strongAgainst) {
        this.id = id;
        this.name = name;
        this.weakAgainst = weakAgainst;
        this.strongAgainst = strongAgainst;
    }

    public Type getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(Type strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public Type getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(Type weakAgainst) {
        this.weakAgainst = weakAgainst;
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
}