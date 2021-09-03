package com.example.tu_dien_koho;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME ="databaseK_ho.db";
    private static final String DATABASE_TABLE = "translate";

    private static final String ID = "id";
    private static final String tuViet = "tuTViet";
    private static final int DATABASE_VERSION= 1;


    public DBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


}
