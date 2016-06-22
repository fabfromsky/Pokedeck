package com.pokedeck.imie.pokedeck.entity;

public class Fight {

    private Integer id;

    private User userA;

    private User userB;

    private User currentPlayer;

    public Fight() {
    }

    public Fight(Integer id, User userA, User userB, User currentPlayer) {
        this.id = id;
        this.userA = userA;
        this.userB = userB;
        this.currentPlayer = currentPlayer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(User currentPlayer) {
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