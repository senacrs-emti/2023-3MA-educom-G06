package com.example.verbpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnPresentContinuous, btnFuture, btnPresentSimple, btnPastContinuous, btnPastSimple, btnPresentPerfectSimple, btnPresentPerfectContinuous, btnPastPerfectSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPresentContinuous = findViewById(R.id.btnPresentContinuous);
        btnPresentContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PresentContinuous.class);
                startActivity(it);
            }
        });
        btnFuture = findViewById(R.id.btnFuture);
        btnFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Future.class);
                startActivity(it);
            }
        });
        btnPresentSimple = findViewById(R.id.btnPresentSimple);
        btnPresentSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PresentSimple.class);
                startActivity(it);
            }
        });
        btnPastContinuous = findViewById(R.id.btnPastContinuous);
        btnPastContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PastContinuous.class);
                startActivity(it);
            }
        });
        btnPastSimple = findViewById(R.id.btnPastSimple);
        btnPastSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PastSimple.class);
                startActivity(it);
            }
        });
        btnPresentPerfectSimple = findViewById(R.id.btnPresentPerfectSimple);
        btnPresentPerfectSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PresentPerfectSimple.class);
                startActivity(it);
            }
        });
        btnPresentPerfectContinuous = findViewById(R.id.btnPresentPerfectContinuous);
        btnPresentPerfectContinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PresentPerfectContinuous.class);
                startActivity(it);
            }
        });
        btnPastPerfectSimple = findViewById(R.id.btnPastPerfectSimple);
        btnPastPerfectSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PastPerfectSimple.class);
                startActivity(it);
            }
        });

        }

    }