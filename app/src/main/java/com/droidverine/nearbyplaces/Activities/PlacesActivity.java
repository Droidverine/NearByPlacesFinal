package com.droidverine.nearbyplaces.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.droidverine.nearbyplaces.Adapters.PlacesAdapter;
import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.models.Places;
import com.droidverine.nearbyplaces.utils.OfflineDatabase;

import java.util.ArrayList;
import java.util.List;

public class PlacesActivity extends Activity {
    OfflineDatabase offlineDatabase;
    List<Places> placesList;
    RecyclerView recyclerView;
    PlacesAdapter placesAdapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
         intent = getIntent();
        placesList = new ArrayList<>();

        Toast.makeText(getApplicationContext(), intent.getStringExtra("placelocality"), Toast.LENGTH_LONG).show();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerplaces);
        offlineDatabase = new OfflineDatabase(getApplicationContext());
        getAllmarks();

    }

    public void getAllmarks() {
        placesList = offlineDatabase.getAllSponsors(intent.getStringExtra("domain"),intent.getStringExtra("placelocality"));
         placesAdapter = new PlacesAdapter(getApplicationContext(), placesList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            recyclerView.setAdapter(placesAdapter);
            placesAdapter.notifyDataSetChanged();
        Log.d("chala","sasdsa");


    }
}
