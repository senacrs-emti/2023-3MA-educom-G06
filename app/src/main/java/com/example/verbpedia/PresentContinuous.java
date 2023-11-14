package com.example.verbpedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class PresentContinuous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Verbpedia");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_continuous);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()){
        case android.R.id.home:
            startActivity(new Intent(this,PresentContinuous.class));
            finishAffinity();
            break;
        default:break;
    }
    return true;
    }
}