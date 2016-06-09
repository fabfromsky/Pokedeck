package com.pokedeck.imie.pokedeck.entity;

import java.util.ArrayList;

public class Trainer {

    private Integer id;

    private String name;

    private String sex;

    private Pokedeck pokedeck;

    private Boolean fighting;

    private Pokemon currentPokemon;

    private ArrayList<Pokemon> pokemonTeam;

    public Trainer() {
    }

    public Trainer(Integer id, String name, String sex, Pokedeck pokedeck) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.pokedeck = pokedeck;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Pokedeck getPokedeck() {
        return pokedeck;
    }

    public void setPokedeck(Pokedeck pokedeck) {
        this.pokedeck = new Pokedeck();
    }

    public Boolean isFighting() {
        return fighting;
    }

    public void setFighting(Boolean fighting) {
        this.fighting = fighting;
    }

    public Pokemon getCurrentPokemon() {
        return currentPokemon;
    }

    public void setCurrentPokemon(Pokemon currentPokemon) {
        this.currentPokemon = currentPokemon;
    }

    public ArrayList<Pokemon> getPokemonTeam() {
        return pokemonTeam;
    }

    public void setPokemonTeam(ArrayList<Pokemon> pokemonTeam) {
        this.pokemonTeam = pokemonTeam;
    }

    /**
     * Create a new fight and set trainers fight mode on.
     *
     * @param opponent
     */
    public void startFight(Trainer opponent) {
        Fight fight = new Fight();
        this.setFighting(true);
        opponent.setFighting(true);
    }

    /**
     * The trainer select his pokemon team amongst his deck.
     *
     * @param deck
     * @return
     */
    public Trainer choosePokemonFighters(Pokedeck deck) {
        ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();
        this.setPokemonTeam(pokemonTeam);
        return this;
    }

    /**
     * The trainer chooses his fighting pokemon amongst his pokemon team.
     *
     * @param pokemon
     */
    public Trainer changePokemon(Pokemon pokemon) {
        this.setCurrentPokemon(pokemon);
        return this;
    }

}