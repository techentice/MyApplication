package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i("MainActivityLogs","onCreate() called");

        //Get the homeButton reference by passing the id to the findViewById()
        Button btn = (Button)findViewById(R.id.homeButton);

        //Set an on click listener to the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.util.Log.i("MainActivityLogs","Home button clicked");
                //Intent is used to switch between activities i.e open home activity onClick event.
                Intent int1 = new Intent(getApplicationContext(),HomeActivity.class);
                android.util.Log.i("MainActivityLogs","Launching Home activity");
                //Start the activity by passing the intent's reference
                startActivity(int1);
            }
        });
    }
}