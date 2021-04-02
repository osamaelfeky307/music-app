package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MartinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martin);


        //make the button of adel active
        Button adel = findViewById(R.id.martin_adel);
        adel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adelIntent = new Intent(MartinActivity.this, MartinActivity.class);
                startActivity(adelIntent);
            }
        });
        //make the button of sia active
        Button sia = findViewById(R.id.martin_sia);
        sia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siaIntent = new Intent(MartinActivity.this,SiaActivity.class);
                startActivity(siaIntent);
            }
        });


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Animals", "Martin"));
        words.add(new Word("In the name of love", "Martin"));
        words.add(new Word("Summer days", "Martin"));
        words.add(new Word("In the name of love ", "Martin"));
        words.add(new Word("Scared to be lonely", "Martin"));
        words.add(new Word("No sleep", "Martin"));
        words.add(new Word("Turn up the speakers", "Martin"));
        words.add(new Word("Ocean", "Martin"));
        words.add(new Word("So far away", "Martin"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}