package com.example.android.trueguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {
    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_places, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Mary's Cathedral", R.drawable.places1));
        words.add(new Word("Cronulla Beach", R.drawable.place2));
        words.add(new Word("Camp Cove", R.drawable.place3));
        words.add(new Word("Opera House", R.drawable.place4));
        words.add(new Word("Manly Sea Life", R.drawable.place5));
        words.add(new Word("Hawksberry River", R.drawable.place6));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file

                Word word = words.get(position);
                // Request audio focus for playback
                Log.v("PlacesFragment","word Position : " + position);
                if(position==1) {
                    Intent eatIntent1 = new Intent(getContext(), PlaceFragment1.class);
                    startActivity(eatIntent1);
                }

            }

        });
        return rootView;
    }

}
