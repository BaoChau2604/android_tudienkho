package com.example.tu_dien_koho;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class FlashCard extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcard);


        List<Topic> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Topic topic = (Topic) o;
                Toast.makeText(FlashCard.this, "Selected :" + " " + topic, Toast.LENGTH_LONG).show();
            }
        });
    }
    private  List<Topic> getListData() {
        List<Topic> list = new ArrayList<Topic>();
        Topic dongvat = new Topic("Động vật", "a", 20);
        Topic connguoi = new Topic("Con người", "b", 20);
        Topic kinhte = new Topic("Kinh tế", "c", 20);
        Topic khoahoc = new Topic("Khoa học", "a", 20);
        Topic thegioi = new Topic("Thế giới", "b", 20);
        Topic nghethuat = new Topic("Nghệ Thuật", "c", 20);


        list.add(dongvat);
        list.add(connguoi);
        list.add(kinhte);
        list.add(khoahoc);
        list.add(thegioi);
        list.add(nghethuat);

        return list;
    }
}
