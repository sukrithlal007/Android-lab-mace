package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {

    public MyHelper(Context context) {
        super(context, "myDb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("CREATE TABLE DEPT (deptid INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30), location VARCHAR(10));");
        } catch (SQLException e) {
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//        db.execSQL("DROP TABLE IF EXISTS DEPT;");
    }

    public long insertData(String username, String password) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", username);
        cv.put("location", password);
        long rowid = db.insert("dept", null, cv);
        return rowid;
    }
    public String getAllData(){
        SQLiteDatabase db = getWritableDatabase();
        String columns[] = {"deptid","name","location"};
        Cursor cr = db.query("dept",columns,null,null,null, null, null);
        StringBuffer buffer = new StringBuffer();
        while (cr.moveToNext()){
            int pid = cr.getInt(0);
            String name = cr.getString(1);
            String password = cr.getString(2);
            buffer.append(pid+ "---"+name+"---"+password+"\n");
        }
        return  buffer.toString();
    }

}
