package com.example.tu_dien_koho;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TuDaTraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tudatra);

        List<TuDaTra> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView_tudatra);
        listView.setAdapter(new WordCustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                TuDaTra tuDaTra = (TuDaTra) o;
                Toast.makeText(TuDaTraActivity.this, "Selected :" + " " + tuDaTra, Toast.LENGTH_LONG).show();
            }
        });
    }
    private  List<TuDaTra> getListData() {
        List<TuDaTra> list = new ArrayList<TuDaTra>();
        TuDaTra vitdan = new TuDaTra("Vịt đàn", "ada");
        TuDaTra cuaquay = new TuDaTra("Cựa quậy", "à wanh");
        TuDaTra vitbau = new TuDaTra("Vịt bầu", "ada prum");
        TuDaTra ngan = new TuDaTra("Ngan", "ada siam");
        TuDaTra cham = new TuDaTra("Chậm", "adàr");
        TuDaTra ledo = new TuDaTra("Lễ độ", "adát");
        TuDaTra dao = new TuDaTra("Đạo", "adát adia");
        TuDaTra daoduc = new TuDaTra("Đạo đức", "adát adia");
        TuDaTra chieungang = new TuDaTra("Chiều ngang", "anàng");
        TuDaTra dinh = new TuDaTra("Đinh", "as");

        TuDaTra ngonngu = new TuDaTra("Ngôn ngữ", "Jơnau");
        TuDaTra nhacua = new TuDaTra("Nhà cửa", "Jơnau");
        TuDaTra doisong = new TuDaTra("Đời sống", "Jơnau");
        TuDaTra dantoc = new TuDaTra("Dân tộc", "Jơnau");
        TuDaTra conguoi = new TuDaTra("Con người", "Jơnau");
        TuDaTra thiennhien = new TuDaTra("Thiên nhiên", "Jơnau");


        list.add(vitdan);
        list.add(cuaquay);
        list.add(vitbau);
        list.add(ngan);
        list.add(cham);
        list.add(ledo);
        list.add(dao);
        list.add(daoduc);
        list.add(chieungang);
        list.add(dinh);

        list.add(ngonngu);
        list.add(nhacua);
        list.add(doisong);
        list.add(dantoc);
        list.add(conguoi);
        list.add(thiennhien);

        return list;
    }
//    public void initData() {
//        listContact.add(new ContactModel("Vịt đàn", "ada", R.drawable.loa));
//        ("Cựa quậy", "à wanh");
//        ("Vịt bầu", "ada prum");
//        ("Ngan", "ada siam");
//        ("Chậm", "adàr");
//        ("Lễ độ", "adát");
//        ("Đạo", "adát adia");
//        ("Đạo đức", "adát adia");
//        ("Chiều ngang", "anàng");
//        ("Đinh", "as");
//
//    }
}
