package com.example.amazonians.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.amazonians.R;
import com.example.amazonians.models.UserModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class HomeActivity extends AppCompatActivity {

    Button btnJourney;

    Location mLocation;

    FirebaseDatabase mDatabase;
    DatabaseReference mDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        FirebaseApp.initializeApp(this);
        mDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mDatabase.getReference();
        getLocation();

        btnJourney = findViewById(R.id.btn_begin_journey);
        btnJourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLocation();
            }
        });

//        sendLocation();
    }

    private void getLocation() {
        LocationRequest request = new LocationRequest();
        request.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        FusedLocationProviderClient client = LocationServices.getFusedLocationProviderClient(this);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            client.requestLocationUpdates(request, new LocationCallback() {
                @Override
                public void onLocationResult(LocationResult locationResult) {
                    mLocation = locationResult.getLastLocation();
//                    Toast.makeText(HomeActivity.this, "Lat: " + mLocation.getLatitude() + "\nLng: " + mLocation.getLongitude(), Toast.LENGTH_SHORT).show();
//                    sendLocation();
//                    startActivity(new Intent(HomeActivity.this, JourneyActivity.class));
//                    mDatabaseReference.child("location").setValue(new UserModel(mLocation.getLatitude(), mLocation.getLongitude()));
                }
            }, null);
        } else {
            Toast.makeText(HomeActivity.this, "Location not found", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendLocation() {
        mDatabaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int userID = (int) (Math.random() * 100);
                mDatabaseReference.child("location").child(String.valueOf(userID)).setValue(new UserModel(mLocation.getLatitude(), mLocation.getLongitude()));
                startActivity(new Intent(HomeActivity.this, JourneyActivity.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
