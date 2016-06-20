package com.pokedeck.imie.pokedeck.entity;

import java.util.ArrayList;

public class User {

    private Integer id;

    private String username;

    private String password;

    private ArrayList<Trainer> trainers;

    public User() {
    }

    public User(Integer id, String username, String password, ArrayList<Trainer> trainers) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.trainers = trainers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTrainer(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public ArrayList<Trainer> getTrainer() {
        return this.trainers;
    }

    public void login(String login, String password) {
    }

    public User createTrainer() {
        Trainer newTrainer = new Trainer();
        this.trainers.add(newTrainer);
        return this;
    }

    public void save(Trainer trainer) {
    }

    public void load(Trainer trainer) {
    }

}