package com.pokedeck.imie.pokedeck.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pokedeck.imie.pokedeck.R;
import com.pokedeck.imie.pokedeck.entity.User;

import java.util.List;

/**
 * Created by Alexandre on 10/06/2016.
 */
public class UserAdapter extends ArrayAdapter<User> {

    Context context;

    public UserAdapter(Context context, List<User> listUser) {
        super(context, -1, listUser);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.listitem_online_users, null);
        } else {
            view = convertView;
        }

        User user = getItem(position);

        // Current users's reference is stored in the current view
        view.setTag(user);

        TextView id = (TextView) view.findViewById(R.id.listitem_online_users_id);
        TextView username = (TextView) view.findViewById(R.id.listitem_online_users_username);
        TextView email = (TextView) view.findViewById(R.id.listitem_online_users_email);

        id.setText(String.format("%b", user.getId()));
        username.setText(user.getUsername());
        email.setText(user.getEmail());

        return view;
    }

}
