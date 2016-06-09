package com.pokedeck.imie.pokedeck.entity;

import java.util.ArrayList;

public class Pokedeck {

    private Integer id;

    private ArrayList<Pokemon> pokemons;

    public Pokedeck() {
    }

    public Pokedeck(Integer id, ArrayList<Pokemon> pokemons) {
        this.id = id;
        this.pokemons = pokemons;
    }

    private ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}