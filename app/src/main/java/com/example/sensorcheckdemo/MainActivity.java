package com.example.sensorcheckdemo;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager sensorManager;
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER) != null) {
            // Success! There's a magnetometer.
            Toast.makeText(this, "GOT THE SENSOR", Toast.LENGTH_LONG).show();
        } else {
            // Failure! No magnetometer.
            Toast.makeText(this, "THIS DEVICE DOESN'T SUPPORT THE SENSOR", Toast.LENGTH_LONG).show();
        }
    }
}
