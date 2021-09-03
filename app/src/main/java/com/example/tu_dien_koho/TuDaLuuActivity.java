package com.example.tu_dien_koho;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TuDaLuuActivity extends AppCompatActivity {
    private RecyclerView rcvTDL;
    private TuDaLuu_Adapter tuDaLuu_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tudaluu);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        rcvTDL = findViewById(R.id.rcv_tdl);
//        tuDaLuu_adapter = new TuDaLuu_Adapter(this);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
//                RecyclerView.VERTICAL,false);
//        rcvTDL.setLayoutManager(linearLayoutManager);
//        tuDaLuu_adapter.setData(getListData());
//        rcvTDL.setAdapter(tuDaLuu_adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tdl, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_dvb:
                Toast.makeText(this, "Chuyển trang", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_dich_van_ban);
                return true;
            case R.id.menu_tdl:
                Toast.makeText(this, "Chuyển trang", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_main);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
//
//    private List<TuDaLuu> getListData(){
//        List<TuDaLuu> list = new ArrayList<>();
//        list.add(new TuDaLuu("a","a"));
//        list.add(new TuDaLuu("b","b"));
//        return list;
//    }
}
