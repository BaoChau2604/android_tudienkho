package com.example.tu_dien_koho;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

        public DatabaseAccess(Context context) {
        this.openHelper = new DBOpenHelper(context);
        }
        public static DatabaseAccess getInstance(Context context){
            if (instance ==null){
                instance = new DatabaseAccess(context);
            }
            return instance;
        }
        public void  open(){
            this.db=openHelper.getWritableDatabase();
        }
        public void close(){
            this.db.close();
        }
        public String getSearch(String tuTV){
            c = db.rawQuery("select * from translate where tuTViet like '%" +tuTV+"%'",new String[]{} );
            StringBuffer buffer = new StringBuffer();
            while (c.moveToNext()){
                String tuTVgoc = c.getString(1);
                buffer.append(""+tuTVgoc);
            }
            return buffer.toString();
        }
}

