package com.pokedeck.imie.pokedeck.service;

import android.util.Log;
import android.widget.ImageView;

import com.pokedeck.imie.pokedeck.R;

import java.lang.reflect.Field;

/**
 * Created by Fab on 22/07/2016.
 */
public class ImageService {

    public int getImageIdByName(String name){
        int drawableId = 0;
        try {
            Class res = R.drawable.class;
            Field field = res.getField(name.toLowerCase());
            drawableId = field.getInt(null);
        }
        catch (Exception e) {
            Log.e("Image source error", "Failed to get drawable id.", e);
        };

        return drawableId;
    }
}
