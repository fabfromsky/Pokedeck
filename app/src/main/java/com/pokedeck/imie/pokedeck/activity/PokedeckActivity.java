package com.pokedeck.imie.pokedeck.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.adapter.PokedeckAdapter;
import com.pokedeck.imie.pokedeck.entity.Attack;
import com.pokedeck.imie.pokedeck.entity.Pokedeck;
import com.pokedeck.imie.pokedeck.entity.Pokemon;
import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;
import com.pokedeck.imie.pokedeck.service.AttackService;
import com.pokedeck.imie.pokedeck.service.ImageService;
import com.pokedeck.imie.pokedeck.util.HorizontalListView;

import java.util.ArrayList;
import java.util.Random;

public class PokedeckActivity extends AppCompatActivity {

    HorizontalListView horizontalListView;
    ArrayList<Pokemon> pokemons;
    Pokemon currentPokemon = null;
    View infoView;
    Context context;
    TextView nickname, pv, speed, attack, attackSpe, defenseSpe, defense;
    ImageView type1, type2;
    int type1ImageId, type2ImageId;
    ImageService imageService;
    static AttackService atkService = new AttackService();

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

                //TODO change attack generation to have pokemon types attacks only
                Attack attack1 = atkService.getAttackById(this, rand.nextInt(107) + 1);
                pokemon.setAttack1(attack1);
                Attack attack2 = atkService.getAttackById(this, rand.nextInt(107) + 1);
                pokemon.setAttack2(attack2);
                Attack attack3 = atkService.getAttackById(this, rand.nextInt(107) + 1);
                pokemon.setAttack3(attack3);
                Attack attack4 = atkService.getAttackById(this, rand.nextInt(107) + 1);
                pokemon.setAttack4(attack4);

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
        type1 = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_type1);
        type2 = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_type2);

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
        imageService = new ImageService();
        if(pokemon.getPokemonType() != null){
            PokemonTypeEnum pokeType = pokemon.getPokemonType();

            if(pokemon.getPokemonType().types.length > 0){
                TypeEnum typeE1 = pokemon.getPokemonType().types[0];
                type1ImageId = imageService.getImageIdByName(typeE1.name());
                type1.setImageResource(type1ImageId);
            }else {
                type1.setImageResource(android.R.color.transparent);
            }
            if(pokemon.getPokemonType().types.length > 1){
                TypeEnum typeE2 = pokemon.getPokemonType().types[1];
                type2ImageId = imageService.getImageIdByName(typeE2.name());
                type2.setImageResource(type2ImageId);
            } else {
                type2.setImageResource(android.R.color.transparent);
            }
        }
    }
}
