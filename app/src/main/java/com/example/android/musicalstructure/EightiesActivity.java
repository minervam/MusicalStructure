package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class EightiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //List of 80's Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("A-ha", "Take On Me"));
        songs.add(new Song("Michael Jackson", "Billie Jean"));
        songs.add(new Song("The Police", "Every Breathe You Take"));
        songs.add(new Song("Wham", "Wake Me Up Before You Go-Go"));
        songs.add(new Song("Tears for Fears", "Everybody Wants to Rule the World"));
        songs.add(new Song("Spandau Ballet", "True"));
        songs.add(new Song("The Cure", "In Between Days"));
        songs.add(new Song("Boy George", "Karma Chameleon"));
        songs.add(new Song("Madonna", "Borderline"));
        songs.add(new Song("Bonnie Tyler", "Total Eclipse of the Heart"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
