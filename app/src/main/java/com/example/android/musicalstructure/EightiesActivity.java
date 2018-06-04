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
        songs.add(new Song("A-ha", "Take On Me", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Michael Jackson", "Billie Jean", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("The Police", "Every Breathe You Take", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Wham", "Wake Me Up Before You Go-Go", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Tears for Fears", "Everybody Wants to Rule the World", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Spandau Ballet", "True", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("The Cure", "In Between Days", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Boy George", "Karma Chameleon", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Madonna", "Borderline", R.drawable.eighties_photo, R.drawable.play_button));
        songs.add(new Song("Bonnie Tyler", "Total Eclipse of the Heart", R.drawable.eighties_photo, R.drawable.play_button));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorBackground);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
