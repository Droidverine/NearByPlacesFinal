package com.droidverine.nearbyplaces.Activities;

import android.app.Activity;
import android.content.Context;


import android.content.Intent;
import android.location.Criteria;
import android.location.LocationListener;
import android.content.pm.PackageManager;
import android.location.Location;



import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.droidverine.nearbyplaces.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private LocationManager locationManager;
    private static final long MIN_TIME = 400;
    private static final float MIN_DISTANCE = 1000;
    MapStyleOptions mapStyleOptions;

    GoogleMap map;
    Double lngd,latd;
    Intent intent;
    String lng,lat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
         intent=getIntent();
        Log.d("lng",intent.getStringExtra("lng")+"");
        Log.d("lat",intent.getStringExtra("lat")+"");
        lngd=Double.parseDouble(intent.getStringExtra("lng"));
        latd=Double.parseDouble(intent.getStringExtra("lat"));




// Register the listener with the Location Manager to receive location updates
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.

        final SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }


    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.

        googleMap.setMyLocationEnabled(true);
        mapStyleOptions = MapStyleOptions.loadRawResourceStyle(MapsActivity.this, R.raw.mapstyle_aubergine);
        googleMap.setMapStyle(mapStyleOptions);
        //  Location location=googleMap.getMyLocation();
        //LatLng current=new LatLng(location.getLongitude(),location.getLatitude());
        LatLng ss = new LatLng(latd,lngd);
        googleMap.addMarker(new MarkerOptions().position(ss)
                .title(intent.getStringExtra("name")));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ss, 15.0f));
       // googleMap.addMarker(new MarkerOptions().position(ss).title("second"));



    }






}
