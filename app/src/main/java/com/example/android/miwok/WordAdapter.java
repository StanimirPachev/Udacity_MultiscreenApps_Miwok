package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SPP on 31/12/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * @param context The current context
     * @param words   A list of Word objects to be displayed in a list
     */
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // get the {@link Word} at this position in the list
        Word currentWord = getItem(position);

        //Find the TextView in the list_tems.xml with the ForeignWord ID
        TextView miwokName = (TextView) ListItemView.findViewById(R.id.ForeignWord);
        miwokName.setText(currentWord.getmMiwokWord());

        //Find the TextView in the list_tems.xml with the LocalWord ID
        TextView engName = (TextView) ListItemView.findViewById(R.id.LocalWord);
        engName.setText(currentWord.getmEngWord());

        return ListItemView;


    }
}
