package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(51.2763, 30.2219);
        mMap.addMarker(new MarkerOptions().position(sydney).title("WARNING: High Toxicity Air"));
        LatLng sydney2 = new LatLng(51.4763, 30.2519);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("WARNING: Moderate Toxicity Air"));
        LatLng sydney3 = new LatLng(51.2353, 30.215);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("WARNING: High Toxicity Air"));
        LatLng sydney4 = new LatLng(51.2963, 30.29);
        mMap.addMarker(new MarkerOptions().position(sydney4).title("WARNING: High Toxicity Air"));
        LatLng sydney5 = new LatLng(51.4763, 30.2019);
        mMap.addMarker(new MarkerOptions().position(sydney5).title("WARNING: Moderate Toxicity Air"));
        LatLng sydney6 = new LatLng(51.233, 30.2);
        mMap.addMarker(new MarkerOptions().position(sydney6).title("WARNING: High Toxicity Air"));
        LatLng sydney7 = new LatLng(51.4, 30.3);
        mMap.addMarker(new MarkerOptions().position(sydney7).title("Low Toxicity Air"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
