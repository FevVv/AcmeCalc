package com.calculator.acme.acme_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Page3 extends AppCompatActivity {
    RadioGroup radioGroup;
    private Button button1,button2;
    float cena = 0;
    final int blue = 8;
    final int poster150 = 10;
    final int poster200 = 10;
    final int canvas = 25;
    final int pvc = 14;
    final int baner = 14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        radioGroup = findViewById(R.id.group);
        button1 = findViewById(R.id.button4);
        button2 = findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1)
                    Toast.makeText(getApplicationContext(),"Please select the material",Toast.LENGTH_SHORT).show();
                else {
                Intent i = new Intent(Page3.this, Page4.class).putExtra("cena",cena);
                startActivity(i); }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page3.this, Page2.class));
            }
        });
        String w = getIntent().getStringExtra("width");
        String h = getIntent().getStringExtra("height");

        final float width = Float.parseFloat(w);
        final float height = Float.parseFloat(h);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButton:
                        cena = (height*width)/10000 * blue;
                        break;
                    case R.id.radioButton2:
                        cena = (height*width)/10000 * poster150;
                        break;
                    case R.id.radioButton3:
                        cena = (height*width)/10000 * poster200;
                        break;
                    case R.id.radioButton4:
                        cena = (height*width)/10000 * canvas;
                        break;
                    case R.id.radioButton5:
                        cena = (height*width)/10000 * pvc;
                        break;
                    case R.id.radioButton6:
                        cena = (height*width)/10000 * baner;
                        break;
                }
            }
         });
    }

}
