package com.pokedeck.imie.pokedeck.entity;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.adapter.UserAdapter;
import com.pokedeck.imie.pokedeck.controller.QueueController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class User {

    private Long id;

    private String username;

    private String email;

    private String password;

    private Boolean fighting;

    private Pokedeck pokedeck;

    private Pokemon currentPokemon;

    private ArrayList<Pokemon> pokemonTeam;

    public User() {
    }

    public User(Long id, String username, String email, String password, Boolean fighting, Pokedeck pokedeck, Pokemon currentPokemon, ArrayList<Pokemon> pokemonTeam) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fighting = fighting;
        this.pokedeck = pokedeck;
        this.currentPokemon = currentPokemon;
        this.pokemonTeam = pokemonTeam;
    }

    public User(JSONObject jsonObject) {
        try {
            this.id = jsonObject.getLong("id");
            this.username = jsonObject.getString("username");
            this.email = jsonObject.getString("email");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getOnlineUsers(final Context context) {
        final ArrayList<User> users = new ArrayList<>();
        String url = context.getResources().getString(R.string.baseURL) + "/api/user/online";

        Log.i("User", "Requested url : " + url);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray onlineUsers = response.getJSONArray("online");

                            for (int i = 0; i < onlineUsers.length(); i++) {
                                JSONObject jsonObject = onlineUsers.getJSONObject(i);

                                User user = new User(jsonObject);
                                users.add(user);
                            }

                            Log.i("User", "L'API a renvoyé une réponse");
                        } catch (Exception e) {
                            Log.e("User", "JSONException : " + e.getMessage());
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("User", "Error : " + error.getMessage());
                    }
                }
        );

        QueueController.getInstance().addToRequestQueue(request);

        users.add(new User(0L, "Joueur non combattant", "peacefull@email.com", "Abcd1234", false, new Pokedeck(), new Pokemon(), new ArrayList<Pokemon>()));
        users.add(new User(0L, "Joueur combattant", "hater@email.com", "Abcd1234", true, new Pokedeck(), new Pokemon(), new ArrayList<Pokemon>()));

        return users;
    }

    /**
     * Create a new fight and set trainers fight mode on.
     *
     * @param opponent
     */
    public void startFight(User opponent) {
        Fight fight = new Fight();
        this.setFighting(true);
        opponent.setFighting(true);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String login, String password) {
    }

    public Boolean isFighting() {
        return fighting;
    }

    public void setFighting(Boolean fighting) {
        this.fighting = fighting;
    }

    public Pokedeck getPokedeck() {
        return pokedeck;
    }

    public void setPokedeck(Pokedeck pokedeck) {
        this.pokedeck = new Pokedeck();
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
}