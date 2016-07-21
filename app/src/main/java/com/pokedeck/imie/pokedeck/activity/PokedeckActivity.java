package com.pokedeck.imie.pokedeck.activity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.adapter.PokedeckAdapter;
import com.pokedeck.imie.pokedeck.entity.Pokedeck;
import com.pokedeck.imie.pokedeck.entity.Pokemon;
import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.util.HorizontalListView;

import java.util.ArrayList;
import java.util.Random;

public class PokedeckActivity extends AppCompatActivity {

    HorizontalListView horizontalListView;
    ArrayList<Pokemon> pokemons;
    Pokemon currentPokemon = null;
    View infoView;
    Context context;
    TextView nickname;
    TextView pv;
    TextView speed;
    TextView attack;
    TextView attackSpe;
    TextView defenseSpe;
    TextView defense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Pokedeck pokedeck = new Pokedeck();
        if (Pokedeck.getPokemons(this.getApplicationContext()).size() == 0) {
            // Creates a pokedeck with 20 random pokemons
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

                pokedeck.addPokemon(this.getApplicationContext(), pokemon);
            }
        }
        context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedeck);

        infoView = findViewById(R.id.pokedeck_pokemon_infos);

        nickname = (TextView) infoView.findViewById(R.id.pokedeck_pokemonName);
        pv = (TextView) infoView.findViewById(R.id.pokedeck_pokePv);
        speed = (TextView) infoView.findViewById(R.id.pokedeck_pokeSpeed);
        attack = (TextView) infoView.findViewById(R.id.pokedeck_pokeAtq);
        attackSpe = (TextView) infoView.findViewById(R.id.pokedeck_pokeAtqSpe);
        defenseSpe = (TextView) infoView.findViewById(R.id.pokedeck_pokeDefSpe);
        defense = (TextView) infoView.findViewById(R.id.pokedeck_pokeDef);

        horizontalListView = (HorizontalListView) findViewById(R.id.pokedeck_list);

        horizontalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = view.getTag();

                if (o != null) {
                    currentPokemon = (Pokemon) o;

                    for(int i=0; i<parent.getChildCount(); i++){
                        ImageView cardBg = (ImageView) parent.getChildAt(i).findViewById(R.id.listitem_card_bg);
                        cardBg.setImageResource(R.drawable.cardshadow);
                    }
                    ImageView cardBg = (ImageView) view.findViewById(R.id.listitem_card_bg);
                    cardBg.setImageResource(R.drawable.cardlight);
                    refreshInfo(currentPokemon);
                }
            }
        });

        pokemons = pokedeck.getPokemons(this);
        currentPokemon = pokemons.get(0);
        refreshInfo(currentPokemon);

    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Pokemon> pokemons = Pokedeck.getPokemons(this);
        PokedeckAdapter pokedeckAdapter = new PokedeckAdapter(this, pokemons);
        horizontalListView.setAdapter(pokedeckAdapter);
    }

    private void refreshInfo(Pokemon pokemon) {
        nickname.setText(currentPokemon.getNickname());
        pv.setText(currentPokemon.getPv().toString());
        speed.setText(currentPokemon.getSpeed().toString());
        attack.setText(currentPokemon.getAttack().toString());
        attackSpe.setText(currentPokemon.getAttackSpe().toString());
        defense.setText(currentPokemon.getDefense().toString());
        defenseSpe.setText(currentPokemon.getDefenseSpe().toString());
    }
}
