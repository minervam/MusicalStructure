package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class SixtiesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //List of 80's Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Beatles", "Hey Jude", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Elvis Presley", "Are You Lonesome Tonight", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("The Kinks", "You Really Got Me", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Simon & Garfunkel", "The Sound of Silence", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Happy Together", "The Turtles", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Steppenwolf", "Born To Be Wild", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("The Righteous Brothers", "Unchained Melody", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Nancy Sinatra", "These Boots Are Made For Walking", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("Roy Orbison", "Oh Pretty Woman", R.drawable.sixties_photo, R.drawable.play_button));
        songs.add(new Song("The Monkees", "I'm A Believer", R.drawable.sixties_photo, R.drawable.play_button));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorBackground);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

