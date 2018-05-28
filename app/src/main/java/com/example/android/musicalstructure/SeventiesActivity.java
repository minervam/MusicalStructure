package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SeventiesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //List of 80's Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("A Night at the Opera", "Bohemian Rhapsody"));
        songs.add(new Song("Bee Gees", "Stayin' Alive"));
        songs.add(new Song("Abba", "Dancing Queen"));
        songs.add(new Song("Diana Ross", "Ain't No Mountain High Enough"));
        songs.add(new Song("Debby Boone", "You Light Up My Life"));
        songs.add(new Song("Roberta Flack", "Killing Me Softly"));
        songs.add(new Song("The Knack", "My Sharona"));
        songs.add(new Song("Gloria Gaynor", "I Will Survive"));
        songs.add(new Song("Eagles", "Hotel California"));
        songs.add(new Song("John Lennon", "Imagine"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
