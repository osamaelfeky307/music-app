package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sia);


        //make the button of martin active
        Button martin = findViewById(R.id.Sia_martin);
        martin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent martinIntent = new Intent(SiaActivity.this, MartinActivity.class);
                startActivity(martinIntent);
            }
        });
        //make the button of adel active
        Button adel = findViewById(R.id.Sia_adel);
        adel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adelIntent = new Intent(SiaActivity.this,AdeleActivity.class);
                startActivity(adelIntent);
            }
        });


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Titanium", "Sia"));
        words.add(new Word("Unstoppable", "Sia"));
        words.add(new Word("Snow man ", "Sia"));
        words.add(new Word("Cheap thrills ", "Sia"));
        words.add(new Word("The greatest", "Sia"));
        words.add(new Word("Let's love alive", "Sia"));
        words.add(new Word("Hellium", "Sia"));
        words.add(new Word("Fire meets gasoline", "Sia"));


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