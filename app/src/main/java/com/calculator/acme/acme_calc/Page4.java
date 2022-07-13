package com.calculator.acme.acme_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Page4 extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        button = findViewById(R.id.button6);
        editText = findViewById(R.id.editText3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page4.this, Page2.class);
                startActivity(i);
            }
        });
        float cena = getIntent().getFloatExtra("cena",123);
        String c = String.format("%.2f",cena);
        editText.setText(c + " €");
    }
}
