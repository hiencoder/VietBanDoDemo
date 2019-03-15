package com.example.hiennv.demo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vietbando.vietbandosdk.maps.MapView;
import com.vietbando.vietbandosdk.constants.Style;
public class MainActivity extends AppCompatActivity {
    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (PermissionUtils.checkPermissionLocation(this)){
            PermissionUtils.requestPermission(this,Manifest.permission.ACCESS_FINE_LOCATION);
        }else {
            mapView = findViewById(R.id.map_view);
            mapView.onCreate(savedInstanceState);
        }
    }
}
