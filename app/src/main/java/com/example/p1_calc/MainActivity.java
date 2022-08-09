package com.example.p1_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        private EditText numOne;
        private EditText numTwo;
        private Button plus;
        private Button minus;
        private Button times;
        private Button divide;

        numOne = (EditText) findViewById(R.id.numOne);
        numTwo = (EditText) findViewById(R.id.numTwo);
        plus   = (Button)   findViewById(R.id.plus);
        minus  = (Button)   findViewById(R.id.minus);
        times  = (Button)   findViewById(R.id.times);
        divide = (Button)   findViewById(R.id.divide);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable ed =;
                num2double(

            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private double num2double(Editable ed){
        String str = ed.toString();
        double number = Double.parseDouble(str);
        return number;
    }
}