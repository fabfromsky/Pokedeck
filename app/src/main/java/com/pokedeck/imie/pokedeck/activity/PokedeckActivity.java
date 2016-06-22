package com.pokedeck.imie.pokedeck.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.adapter.PokedeckAdapter;
import com.pokedeck.imie.pokedeck.entity.Pokedeck;
import com.pokedeck.imie.pokedeck.entity.Pokemon;

import java.util.ArrayList;

public class PokedeckActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Pokedeck.getPokemons(this.getApplicationContext()).size() == 0) {
            // TODO: Change this for a proper pokedeck creation
            // Creates a test pokedeck in case it's not yet ready
            for (int i = 0; i <= 19; i++) {
                Pokemon pokemon = new Pokemon();
                pokemon.setNickname("Pikachu");
                pokemon.setPv(150);

                Pokedeck pokedeck = new Pokedeck();
                pokedeck.addPokemon(this.getApplicationContext(), pokemon);
            }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedeck);

        listView = (ListView) findViewById(R.id.pokedeck_list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = view.getTag();

                if (o != null) {
                    Pokemon pokemon = (Pokemon) o;
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Pokemon> pokemons = Pokedeck.getPokemons(this);
        PokedeckAdapter pokedeckAdapter = new PokedeckAdapter(this, pokemons);
        listView.setAdapter(pokedeckAdapter);
    }
}
