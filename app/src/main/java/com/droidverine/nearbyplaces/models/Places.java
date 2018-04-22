package com.droidverine.nearbyplaces.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by DELL on 08-03-2018.
 */

public class Places {
    String placename,placeaddress,placefulladdr;
    Double  lat,Lng;

    public Places() {
    }

    public Places(String placename, String placeaddress, Double lat, Double lng,String placefulladdr) {
        this.placename = placename;
        this.placeaddress = placeaddress;
        this.lat = lat;
       this.Lng = lng;
        this.placefulladdr=placefulladdr;
    }

    public String getPlacefulladdr() {
        return placefulladdr;
    }

    public void setPlacefulladdr(String placefulladdr) {
        this.placefulladdr = placefulladdr;
    }

    public String getPlaceaddress() {
        return placeaddress;
    }

    public void setPlaceaddress(String placeaddress) {
        this.placeaddress = placeaddress;
    }


    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }


    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        Lng = lng;
    }
}
