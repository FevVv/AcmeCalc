package com.calculator.acme.acme_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-8103564854164735/4127450458");
        button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, Page2.class);
        startActivity(i);

        }
        });
        }

        }
