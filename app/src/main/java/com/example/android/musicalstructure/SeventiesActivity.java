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
        songs.add(new Song("A Night at the Opera", "Bohemian Rhapsody", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Bee Gees", "Stayin' Alive", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Abba", "Dancing Queen", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Diana Ross", "Ain't No Mountain High Enough", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Debby Boone", "You Light Up My Life", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Roberta Flack", "Killing Me Softly", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("The Knack", "My Sharona", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Gloria Gaynor", "I Will Survive", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("Eagles", "Hotel California", R.drawable.seventies_photo, R.drawable.play_button));
        songs.add(new Song("John Lennon", "Imagine", R.drawable.seventies_photo, R.drawable.play_button));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorBackground);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
