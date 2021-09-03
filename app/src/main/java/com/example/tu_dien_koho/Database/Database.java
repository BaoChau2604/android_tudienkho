package com.example.tu_dien_koho.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.tu_dien_koho.Model.translate;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {
    private static final String DB_NAME = "databaseK_ho.db";
    private static final int DB_VER = 1;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }
    public List<translate> getTranlates(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"tuTViet", "loaiTu","NghiaKHo", "Vidu1", "Nghia1", "ViDu2", "Nghia2"};
        String tableName = "translate";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null,null,null,null,null);
        List<translate> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do {
                translate trans = new translate();
                //trans.setId(cursor.getInt(cursor.getColumnIndex("id")));
                trans.setTuTV(cursor.getString(cursor.getColumnIndex("tuTViet")));
                trans.setLoaitu(cursor.getString(cursor.getColumnIndex("loaiTu")));
                trans.setNghiakho(cursor.getString(cursor.getColumnIndex("NghiaKHo")));
                trans.setVd1(cursor.getString(cursor.getColumnIndex("ViDu1")));
                trans.setNghia1(cursor.getString(cursor.getColumnIndex("Nghia1")));
                trans.setVd2(cursor.getString(cursor.getColumnIndex("ViDu2")));
                trans.setNghia2(cursor.getString(cursor.getColumnIndex("Nghia2")));

                result.add(trans);
            }while (cursor.moveToNext());
        }
        return result;
    }
    public List<String> gettuTV(){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"tuTViet"};
        String tableName = "translate";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null,null,null,null,null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do {
                result.add(cursor.getString(cursor.getColumnIndex("tuTViet")));
            }while (cursor.moveToNext());
        }
        return result;
    }
    public List<translate> getByName(String tuTV){
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"tuTViet", "loaiTu","NghiaKHo", "Vidu1", "Nghia1", "ViDu2", "Nghia2"};
        String tableName = "translate";

        qb.setTables(tableName);
        //Cursor cursor = qb.query(db,sqlSelect,"tuTViet = ?",new String[] {tuTV},null,null,null);
        Cursor cursor = qb.query(db,sqlSelect,"tuTViet LIKE ?",new String[] {"%"+tuTV+"%"},null,null,null);
        List<translate> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do {
                translate trans = new translate();
                //trans.setId(cursor.getInt(cursor.getColumnIndex("id")));
                trans.setTuTV(cursor.getString(cursor.getColumnIndex("tuTViet")));
                trans.setLoaitu(cursor.getString(cursor.getColumnIndex("loaiTu")));
                trans.setNghiakho(cursor.getString(cursor.getColumnIndex("NghiaKHo")));
                trans.setVd1(cursor.getString(cursor.getColumnIndex("ViDu1")));
                trans.setNghia1(cursor.getString(cursor.getColumnIndex("Nghia1")));
                trans.setVd2(cursor.getString(cursor.getColumnIndex("ViDu2")));
                trans.setNghia2(cursor.getString(cursor.getColumnIndex("Nghia2")));

                result.add(trans);
            }while (cursor.moveToNext());
        }
        return result;
    }

}
