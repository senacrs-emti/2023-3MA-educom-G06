package com.example.app_verb_tenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPresentSimple, btnPresentContinuous, btnPastContinuous, btnPastSimple, btnPresentPerfectSimple, btnPresentPerfectContinuous, btnPastPerferctSimple, btnFuture, btnFutureContinuous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPresentSimple = findViewById(R.id.btnPresentSimple);
        btnPresentSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentSimple = new Intent(getApplicationContext(), SimplePresent.class);
                startActivity(PresentSimple);
            }
        });

        btnPresentContinuous = findViewById(R.id.btnPresentContinuous);
        btnPresentContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentContinuous = new Intent(getApplicationContext(), PresentContinuous.class);
                startActivity(PresentContinuous);
            }
        });

        btnPastContinuous = findViewById(R.id.btnPastContinuous);
        btnPastContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PastContinuous = new Intent(getApplicationContext(), PastContinuous.class);
                startActivity(PastContinuous);
            }
        });

        btnPastSimple = findViewById(R.id.btnPastSimple);
        btnPastSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SimplePast = new Intent(getApplicationContext(), SimplePast.class);
                startActivity(SimplePast);
            }
        });

        btnPresentPerfectSimple = findViewById(R.id.btnPresentPerfectSimple);
        btnPresentPerfectSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentPerfectSimple = new Intent(getApplicationContext(), PresentPerfectSimple.class);
                startActivity(PresentPerfectSimple);
            }
        });

        btnPresentPerfectContinuous = findViewById(R.id.btnPresentPerfectContinuous);
        btnPresentPerfectContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentPerfectContinuous = new Intent(getApplicationContext(), PresentPerfectContinuous.class);
                startActivity(PresentPerfectContinuous);
            }
        });

        btnPastPerferctSimple = findViewById(R.id.btnPastPerfectSimple);
        btnPastPerferctSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PastPerfectSimple = new Intent(getApplicationContext(),com.example.app_verb_tenses.PastPerfectSimple.class);
                startActivity(PastPerfectSimple);
            }
        });

        btnFuture = findViewById(R.id.btnFuture);
        btnFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SimpleFuture = new Intent(getApplicationContext(),SimpleFuture.class);
                startActivity(SimpleFuture);
            }
        });

        btnFutureContinuous = findViewById(R.id.btnFutureContinuous);
        btnFutureContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FutureContinuous = new Intent(getApplicationContext(), FutureContinuous.class);
                startActivity(FutureContinuous);
            }
        });
    }
}