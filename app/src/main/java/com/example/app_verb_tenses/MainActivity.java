package com.example.app_verb_tenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPresentSimple, btnPresentContinuous, btnPastContinuous, btnPastSimple, btnSimpleFuture, btnPresentPerfectSimple, btnPresentPerfectContinuous, btnFuture;

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

        btnPresentSimple = findViewById(R.id.btnPresentContinuous);
        btnPresentSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentSimple = new Intent(getApplicationContext(), PresentContinuous.class);
                startActivity(PresentSimple);
            }
        });

        btnPastContinuous = findViewById(R.id.btnPastContinuous);
        btnPastContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PastContinuous = new Intent(getApplicationContext(),com.example.app_verb_tenses.PastContinuous.class);
                startActivity(PastContinuous);
            }
        });

        btnPastPerfect = findViewById(R.id.btnPastSimple);
        btnPastPerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PastPerfect = new Intent(getApplicationContext(),com.example.app_verb_tenses.PastPerfect.class);
                startActivity(PastPerfect);
            }
        });

        btnSimpleFuture = findViewById(R.id.btnSimpleFuture);
        btnSimpleFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SimpleFuture = new Intent(getApplicationContext(),com.example.app_verb_tenses.SimpleFuture.class);
                startActivity(SimpleFuture);
            }
        });

        btnPresentPerfectSimple = findViewById(R.id.btnPresentPerfectSimple);
        btnPresentPerfectSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentPerfectSimple = new Intent(getApplicationContext(),com.example.app_verb_tenses.PresentPerfectSimple.class);
                startActivity(PresentPerfectSimple);
            }
        });

        btnPresentPerfectContinuous = findViewById(R.id.btnPresentPastContinuous);
        btnPresentPerfectContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PresentPerfectContinuous = new Intent(getApplicationContext(),com.example.app_verb_tenses.PresentPerfectContinuous.class);
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

        btnFuturePerfect = findViewById(R.id.btnFuturePerfect);
        btnFuturePerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FuturePerfect = new Intent(getApplicationContext(),com.example.app_verb_tenses.FuturePerfect.class);
                startActivity(FuturePerfect);
            }
        });

        btnFuturePerfectContinuous = findViewById(R.id.btnFuturePerfectContinuous);
        btnFuturePerfectContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FuturePerfectContinuous = new Intent(getApplicationContext(),com.example.app_verb_tenses.FuturePerfectContinuous.class);
                startActivity(FuturePerfectContinuous);
            }
        });
    }
}