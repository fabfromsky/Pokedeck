package com.pokedeck.imie.pokedeck.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.entity.Pokemon;
import com.pokedeck.imie.pokedeck.service.ImageService;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Alexandre on 10/06/2016.
 */
public class PokedeckAdapter extends ArrayAdapter<Pokemon> {

    Context context;
    ImageService imageService;

    public PokedeckAdapter(Context context, List<Pokemon> listPokemon) {
        super(context, -1, listPokemon);
        this.context = context;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.listitem_pokedeck, null);
        } else {
            view = convertView;
        }

        Pokemon pokemon = getItem(position);

        // Current pokemon's reference is store in the current view
        view.setTag(pokemon);

        ImageView pokemonImg = (ImageView) view.findViewById(R.id.listitem_pokedeck_image);
        String imageName = pokemon.getNickname();
        imageService = new ImageService();
        int imageId = imageService.getImageIdByName(imageName);
        pokemonImg.setImageResource(imageId);
        return view;
    }
}
