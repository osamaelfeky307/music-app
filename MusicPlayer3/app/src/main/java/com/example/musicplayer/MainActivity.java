package com.example.musicplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView amr = findViewById(R.id.Adele_albums);
        amr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AdeleIntent = new Intent(MainActivity.this, AdeleActivity.class);
                startActivity(AdeleIntent);
            }
        });

        TextView tamer = findViewById(R.id.Sia_Albums);
        tamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SiaIntent = new Intent(MainActivity.this, SiaActivity.class);
                startActivity(SiaIntent);
            }
        });

        TextView playList = findViewById(R.id.Martin_Albums);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MartinIntent = new Intent(MainActivity.this, MartinActivity.class);
                startActivity(MartinIntent);
            }
        });
    }
}