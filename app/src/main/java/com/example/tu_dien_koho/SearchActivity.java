package com.example.tu_dien_koho;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tu_dien_koho.Adapter.SearchApdapter;
import com.example.tu_dien_koho.Database.Database;
import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    SearchApdapter adapter;

    MaterialSearchBar searchBar;
    List<String> suggestList = new ArrayList<>();
    Database database;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        recyclerView = (RecyclerView)findViewById(R.id.recycleView_search);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        searchBar = (MaterialSearchBar) findViewById(R.id.search_bar);

        database = new Database(this);
        searchBar.setHint("Search");
        searchBar.setCardViewElevation(10);
        loadSuggestList();
        searchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List<String> suggset = new ArrayList<>();
                for (String search:suggestList)
                {
                    if (search.toLowerCase().contains(searchBar.getText().toLowerCase()));
                    suggset.add(search);
                }
                searchBar.setLastSuggestions(suggset);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        searchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {
                if (!enabled)
                {
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onSearchConfirmed(CharSequence text) {
                startSearch(text.toString());
            }

            @Override
            public void onButtonClicked(int buttonCode) {

            }
        });
        adapter = new SearchApdapter(SearchActivity.this,database.getTranlates());
        recyclerView.setAdapter(adapter);
        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent intent = new Intent(getApplicationContext(), WordDetailsActivity.class);
                startActivity(intent);
               // Toast.makeText(SearchActivity.this,"tuTViet:"+v.getString(0),Toast.LENGTH_LONG).show();
            }
        });
    }
    private void startSearch(String text) {
        adapter = new SearchApdapter(this,database.getByName(text));
        recyclerView.setAdapter(adapter);
    }

    private void loadSuggestList() {
        suggestList = database.gettuTV();
        searchBar.setLastSuggestions(suggestList);
    }

}
