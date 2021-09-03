package com.example.tu_dien_koho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FloatingActionButton fab;
        CardView cvtudaluu;
        CardView cvflashcard;
        CardView cvdvb;
        CardView cvtudatra;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fab = findViewById(R.id.fab_search);
        cvtudaluu = findViewById(R.id.cardViewTuDaLuu);
        cvflashcard = findViewById(R.id.cardViewFlashCard);
        cvdvb = findViewById(R.id.cardViewDVB);
        cvtudatra = findViewById(R.id.cardViewTuDaTra);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        cvtudaluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,TuDaLuuActivity.class);
                startActivity(intent);
            }
        });
        cvdvb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,DichVanBan.class);
                startActivity(intent);
            }
        });
        cvflashcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,FlashCard.class);
                startActivity(intent);
            }
        });
        cvtudatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,TuDaTraActivity.class);
                startActivity(intent);
            }
        });
    }

}