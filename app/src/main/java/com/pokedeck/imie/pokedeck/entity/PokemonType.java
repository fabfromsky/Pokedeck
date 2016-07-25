package com.pokedeck.imie.pokedeck.entity;

import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;

import java.util.ArrayList;

public class PokemonType {

    private Long id;

    private String name;

    private Integer idPokedex;

    private ArrayList<TypeEnum> types;

    public PokemonType() {
    }

    public PokemonType(Long id, String name, Integer idPokedex, ArrayList<TypeEnum> types) {
        this.id = id;
        this.name = name;
        this.idPokedex = idPokedex;
        this.types = types;
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

    public Integer getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(Integer idPokedex) {
        this.idPokedex = idPokedex;
    }

    public ArrayList<TypeEnum> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<TypeEnum> type) {
        this.types = types;
    }
}