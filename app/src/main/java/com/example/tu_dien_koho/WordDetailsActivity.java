package com.example.tu_dien_koho;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WordDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuvung_chitiet);

        TextView tugoc, loaitu,nghiakho,vd1,nghia1,vd2,nghia2;

        tugoc = findViewById(R.id.TuGoc_TextView);
        loaitu = findViewById(R.id.Loaitu_TextView);
        nghiakho = findViewById(R.id.Nghiakho_TextView);
        vd1 = findViewById(R.id.VD1_TextView);
        nghia1 = findViewById(R.id.Nghia1_TextView);
        vd2 = findViewById(R.id.VD2_TextView);
        nghia2 = findViewById(R.id.Nghia2_TextView);
    }
}
