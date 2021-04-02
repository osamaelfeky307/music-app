package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AdeleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adele);


        //make the button of martin active
        Button martin = findViewById(R.id.adel_martin);
        martin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent martinIntent = new Intent(AdeleActivity.this, MartinActivity.class);
                startActivity(martinIntent);
            }
        });
        //make the button of sia active
        Button sia = findViewById(R.id.adel_sia);
        sia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siaIntent = new Intent(AdeleActivity.this,SiaActivity.class);
                startActivity(siaIntent);
            }
        });


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Hello", "Adele"));
        words.add(new Word("Someone like you", "Adele"));
        words.add(new Word("Skyfall ", "Adele"));
        words.add(new Word("Roling in the deep", "Adele"));
        words.add(new Word("When we were young", "Adele"));
        words.add(new Word("Send my love", "Adele"));
        words.add(new Word("One and only ", "Adele"));
        words.add(new Word("Turning tables ", "Adele"));


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