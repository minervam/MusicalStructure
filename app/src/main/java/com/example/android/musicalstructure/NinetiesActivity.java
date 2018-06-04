package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NinetiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //List of 80's Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("No Doubt", "Don't Speak", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Seal", "Kiss From A Rose", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("MC Hammer", "U Can't Touch This", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Nirvana", "Smells Like Teen Spirit", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Radiohead", "Creep", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Oasis", "Wonderwall", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Whitney Houston", "I Will Always Love You", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Christina Aguilera", "Genie In A Bottle", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Alanis Morissette", "You Oughta Know", R.drawable.nineties_photo, R.drawable.play_button));
        songs.add(new Song("Backstreet Boys", "I want It That Way", R.drawable.nineties_photo, R.drawable.play_button));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorBackground);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

