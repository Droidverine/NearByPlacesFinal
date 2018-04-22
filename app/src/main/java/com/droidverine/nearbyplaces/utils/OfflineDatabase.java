package com.droidverine.nearbyplaces.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.droidverine.nearbyplaces.models.Places;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by DELL on 08-03-2018.
 */

public class OfflineDatabase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "NEARBYPLACES.db";
    private static final String CREATE_NEARBY_TABLE = "CREATE TABLE IF NOT EXISTS "
            + DetailsManager.PLACES_TABLE + " ( " + DetailsManager.PLACE_LOCATIONS +
            " VARCHAR DEFAULT NULL, "+DetailsManager.PLACES_LONG+" VARCHAR DEFAULT NULL, "
            + DetailsManager.PLACES_NAMES +" VARCHAR DEFAULT NULL, "+ DetailsManager.PLACES_ADDRESS +" VARCHAR DEFAULT NULL , "
            +DetailsManager.PLACES_LAN +" VARCHAR DEFAULT NULL, "+DetailsManager.PLACES_DOMAIN +" VARCHAR DEFAULT NULL );";
    private  static  final String TRUNCATE_PLACES="DELETE FROM "+DetailsManager.PLACES_TABLE+";";
    public OfflineDatabase(Context context) {
        super(context,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_NEARBY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void truncateSponsors()
    {
        SQLiteDatabase database=getWritableDatabase();
        Log.d("table sponsors ","dropped");
        database.execSQL(TRUNCATE_PLACES);
    }
    public ArrayList<Places> getAllSponsors(String domain,String location)
    {
        ArrayList<Places> placesArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DetailsManager.PLACES_TABLE, new String[]{"*"}, DetailsManager.PLACES_DOMAIN+"='"+domain+"' AND "+DetailsManager.PLACE_LOCATIONS+"='"+location+"'", null, null, null, null);

        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext())
        {
            Places places_data = new Places();
            places_data.setPlacename(cursor.getString(cursor.getColumnIndex(DetailsManager.PLACES_NAMES)));
            places_data.setLat(cursor.getDouble(cursor.getColumnIndex(DetailsManager.PLACES_LAN)));
            places_data.setLng(cursor.getDouble(cursor.getColumnIndex(DetailsManager.PLACES_LONG)));
            places_data.setPlaceaddress(cursor.getString(cursor.getColumnIndex(DetailsManager.PLACE_LOCATIONS)));
            places_data.setPlacefulladdr(cursor.getString(cursor.getColumnIndex(DetailsManager.PLACES_ADDRESS)));

            placesArrayList.add(places_data);
           // Log.d("getdata",cursor.getString(cursor.getColumnIndex(DetailsManager.PLACES_TABLE)));
            Log.d("alareala",cursor.getString(cursor.getColumnIndex(DetailsManager.PLACES_ADDRESS))+"");
        }
        cursor.close();
        db.close();
        return placesArrayList;
    }
    public void insertSponsors(HashMap<String, String> map) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DetailsManager.PLACE_LOCATIONS, map.get(DetailsManager.PLACE_LOCATIONS));
        values.put(DetailsManager.PLACES_NAMES, map.get(DetailsManager.PLACES_NAMES));
        values.put(DetailsManager.PLACES_LAN, map.get(DetailsManager.PLACES_LAN));
        values.put(DetailsManager.PLACES_LONG, map.get(DetailsManager.PLACES_LONG));
        values.put(DetailsManager.PLACES_DOMAIN, map.get(DetailsManager.PLACES_DOMAIN));

        db.insert(DetailsManager.PLACES_TABLE, null, values);
        Log.d("inserted",map.get(DetailsManager.PLACES_DOMAIN)+"");

    }
    public void insertSponsors1(HashMap<String, String> map) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DetailsManager.PLACE_LOCATIONS, map.get(DetailsManager.PLACE_LOCATIONS));
        values.put(DetailsManager.PLACES_NAMES, map.get(DetailsManager.PLACES_NAMES));
        values.put(DetailsManager.PLACES_LAN, map.get(DetailsManager.PLACES_LAN));
        values.put(DetailsManager.PLACES_LONG, map.get(DetailsManager.PLACES_LONG));
        values.put(DetailsManager.PLACES_DOMAIN, map.get(DetailsManager.PLACES_DOMAIN));
        values.put(DetailsManager.PLACES_ADDRESS, map.get(DetailsManager.PLACES_ADDRESS));

        db.insert(DetailsManager.PLACES_TABLE, null, values);
        Log.d("inserted",map.get(DetailsManager.PLACES_ADDRESS)+"");

    }
}
