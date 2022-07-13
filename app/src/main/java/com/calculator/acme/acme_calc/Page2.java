package com.calculator.acme.acme_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Page2 extends AppCompatActivity {
    private Button button, button1;
    private EditText editText, editText1;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        button = findViewById(R.id.button2);
        adView = findViewById(R.id.adView1);
        button1 = findViewById(R.id.button3);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().matches("")|| editText1.getText().toString().matches(""))
                    Toast.makeText(getApplicationContext(),"Please enter the dimensions",Toast.LENGTH_SHORT).show();
                else {
                Intent i = new Intent(Page2.this, Page3.class).putExtra("width", editText.getText().toString())
                        .putExtra("height", editText1.getText().toString());
                startActivity(i); }
        }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, MainActivity.class));
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
       adView.loadAd(adRequest);

    }
}
