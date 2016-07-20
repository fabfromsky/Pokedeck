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
import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PokedeckActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Pokedeck.getPokemons(this.getApplicationContext()).size() == 0) {
            // TODO: Change this for a proper pokedeck creation
            // Creates a test pokedeck in case it's not yet ready
            Random rand = new Random();
            for (int i = 0; i <= 19; i++) {
                Pokemon pokemon = new Pokemon();
                PokemonTypeEnum pokeType = PokemonTypeEnum.values()[rand.nextInt(PokemonTypeEnum.values().length)];

                pokemon.setPokemonType(pokeType);
                pokemon.setNickname(pokeType.name);
                pokemon.setPv(rand.nextInt(500));
                pokemon.setSpeed(rand.nextInt(500));
                pokemon.setAttack(rand.nextInt(500));
                pokemon.setAttackSpe(pokemon.getAttack() + rand.nextInt(100));
                pokemon.setDefense(rand.nextInt(500));
                pokemon.setDefenseSpe(pokemon.getDefense() + rand.nextInt(100));
                pokemon.setIdPokedeck(rand.nextInt(151) + 1);

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
                    String pokeId;
                    if(pokemon.getPokemonType().idPokedex < 100 && pokemon.getPokemonType().idPokedex >= 10){
                        pokeId = "0" + pokemon.getPokemonType().idPokedex.toString();
                    } else if(pokemon.getPokemonType().idPokedex < 10){
                        pokeId = "00" + pokemon.getPokemonType().idPokedex.toString();
                    } else {
                        pokeId = pokemon.getPokemonType().idPokedex.toString();
                    }
                    String imageSrc = pokeId + ".png";
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
