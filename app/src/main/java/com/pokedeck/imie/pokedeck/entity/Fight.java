package com.pokedeck.imie.pokedeck.entity;

public class Fight {

    private Integer id;

    private Trainer trainerA;

    private Trainer trainerB;

    private Trainer currentPlayer;

    public Fight() {
    }

    public Fight(Integer id, Trainer trainerA, Trainer trainerB, Trainer currentPlayer) {
        this.id = id;
        this.trainerA = trainerA;
        this.trainerB = trainerB;
        this.currentPlayer = currentPlayer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Trainer getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Trainer currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /**
     *
     */
    public void getReady() {
    }

    /**
     *
     */
    public void start() {
    }

    /**
     *
     */
    public void selectAction() {
    }

}