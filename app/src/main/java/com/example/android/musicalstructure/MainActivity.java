package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the songs from the 60s category
        ImageView sixties = (ImageView) findViewById(R.id.sixties);

        // Set a click listener on that View
        sixties.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the sixties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SixtiesActivity}
                Intent sixtiesIntent = new Intent(MainActivity.this, SixtiesActivity.class);

                // Start the new activity
                startActivity(sixtiesIntent);
            }
        });

        // Find the View that shows the seventies category
        ImageView seventies = (ImageView) findViewById(R.id.seventies);

        // Set a click listener on that View
        seventies.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the seventies category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeventiesActivity}
                Intent seventiesIntent = new Intent(MainActivity.this, SeventiesActivity.class);

                // Start the new activity
                startActivity(seventiesIntent);
            }
        });

        // Find the View that shows the eighties category
        ImageView eighties = (ImageView) findViewById(R.id.eighties);

        // Set a click listener on that View
        eighties.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the eighties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EightiesActivity}
                Intent eightiesIntent = new Intent(MainActivity.this, EightiesActivity.class);

                // Start the new activity
                startActivity(eightiesIntent);
            }
        });

        // Find the View that shows the nineties category
        ImageView nineties = (ImageView) findViewById(R.id.nineties);

        // Set a click listener on that View
        nineties.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the nineties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NinetiesActivity}
                Intent ninetiesIntent = new Intent(MainActivity.this, NinetiesActivity.class);

                // Start the new activity
                startActivity(ninetiesIntent);
            }
        });
    }
}
