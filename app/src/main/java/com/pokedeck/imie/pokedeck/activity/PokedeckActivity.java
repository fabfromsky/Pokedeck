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
import com.pokedeck.imie.pokedeck.entity.Pokedeck;
import com.pokedeck.imie.pokedeck.entity.Pokemon;
import com.pokedeck.imie.pokedeck.enumeration.AttackEnum;
import com.pokedeck.imie.pokedeck.enumeration.PokemonTypeEnum;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;
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
    TextView nickname, pv, speed, attack, attackSpe, defenseSpe, defense,
            attack1, attack2, attack3, attack4;
    ImageView type1, type2, attack1Img, attack2Img, attack3Img, attack4Img;
    int type1ImageId, type2ImageId;
    ImageService imageService;

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

                // Random attacks from pokemon types attacks
                // we first define the pokemon types attacks in a list.
                ArrayList<AttackEnum> pokemonTypeAttacksList = new ArrayList<>();
                for (int j = 0; j < AttackEnum.values().length; j++) {
                    if (AttackEnum.values()[j].type == pokemon.getPokemonType().types[0] ||
                            (pokemon.getPokemonType().types.length > 1 &&
                                    AttackEnum.values()[j].type == pokemon.getPokemonType().types[1])) {
                        pokemonTypeAttacksList.add(AttackEnum.values()[j]);
                    }
                }

                // We set the first attack with a random one then we remove it from attack list
                // in order not to get it again repeat until 4th attack.
                AttackEnum attack1 = pokemonTypeAttacksList.get(rand.nextInt(pokemonTypeAttacksList.size()));
                pokemon.setAttack1(attack1);
                pokemonTypeAttacksList.remove(attack1);

                AttackEnum attack2 = pokemonTypeAttacksList.get(rand.nextInt(pokemonTypeAttacksList.size()));
                pokemon.setAttack2(attack2);
                pokemonTypeAttacksList.remove(attack2);

                AttackEnum attack3 = pokemonTypeAttacksList.get(rand.nextInt(pokemonTypeAttacksList.size()));
                pokemon.setAttack3(attack3);
                pokemonTypeAttacksList.remove(attack3);

                AttackEnum attack4 = pokemonTypeAttacksList.get(rand.nextInt(pokemonTypeAttacksList.size()));
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

        attack1 = (TextView) infoView.findViewById(R.id.pokedeck_pokemon_atk1_name);
        attack2 = (TextView) infoView.findViewById(R.id.pokedeck_pokemon_atk2_name);
        attack3 = (TextView) infoView.findViewById(R.id.pokedeck_pokemon_atk3_name);
        attack4 = (TextView) infoView.findViewById(R.id.pokedeck_pokemon_atk4_name);

        attack1Img = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_atk1_img);
        attack2Img = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_atk2_img);
        attack3Img = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_atk3_img);
        attack4Img = (ImageView) infoView.findViewById(R.id.pokedeck_pokemon_atk4_img);

        horizontalListView = (HorizontalListView) findViewById(R.id.pokedeck_list);

        horizontalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = view.getTag();

                if (o != null) {
                    currentPokemon = (Pokemon) o;

                    for (int i = 0; i < parent.getChildCount(); i++) {
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


    // Refresh info view with selected pokemon stats
    private void refreshInfo(Pokemon pokemon) {
        nickname.setText(currentPokemon.getNickname());
        pv.setText(currentPokemon.getPv().toString());
        speed.setText(currentPokemon.getSpeed().toString());
        attack.setText(currentPokemon.getAttack().toString());
        attackSpe.setText(currentPokemon.getAttackSpe().toString());
        defense.setText(currentPokemon.getDefense().toString());
        defenseSpe.setText(currentPokemon.getDefenseSpe().toString());
        imageService = new ImageService();

        if (pokemon.getPokemonType() != null) {

            if (pokemon.getPokemonType().types.length > 0) {
                TypeEnum typeE1 = pokemon.getPokemonType().types[0];
                type1ImageId = imageService.getImageIdByName(typeE1.name());
                type1.setImageResource(type1ImageId);
            } else {
                type1.setImageResource(android.R.color.transparent);
            }

            if (pokemon.getPokemonType().types.length > 1) {
                TypeEnum typeE2 = pokemon.getPokemonType().types[1];
                type2ImageId = imageService.getImageIdByName(typeE2.name());
                type2.setImageResource(type2ImageId);
            } else {
                type2.setImageResource(android.R.color.transparent);
            }
        }

        if (pokemon.getAttack1() != null) {
            attack1.setText(pokemon.getAttack1().name);
            attack1Img.setImageResource(imageService.getImageIdByName(pokemon.getAttack1().type.name()));
        }

        if (pokemon.getAttack2() != null) {
            attack2.setText(pokemon.getAttack2().name);
            attack2Img.setImageResource(imageService.getImageIdByName(pokemon.getAttack2().type.name()));
        }

        if (pokemon.getAttack3() != null) {
            attack3.setText(pokemon.getAttack3().name);
            attack3Img.setImageResource(imageService.getImageIdByName(pokemon.getAttack3().type.name()));
        }

        if (pokemon.getAttack4() != null) {
            attack4.setText(pokemon.getAttack4().name);
            attack4Img.setImageResource(imageService.getImageIdByName(pokemon.getAttack4().type.name()));
        }
    }
}
