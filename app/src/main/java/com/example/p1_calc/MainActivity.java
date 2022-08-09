package com.example.p1_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText numOne;
        EditText numTwo;
        Button plus;
        Button minus;
        Button times;
        Button divide;
        TextView result;

        //double a = 1,b = 1,res = 1;

        numOne = (EditText) findViewById(R.id.numOne);
        numTwo = (EditText) findViewById(R.id.numTwo);
        plus   = (Button)   findViewById(R.id.plus);
        minus  = (Button)   findViewById(R.id.minus);
        times  = (Button)   findViewById(R.id.times);
        divide = (Button)   findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.ans);

            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        double a = Double.parseDouble(numOne.getText().toString());
                        double b = Double.parseDouble(numTwo.getText().toString());
                        double res = a + b;
                        result.setText(Double.toString(res));
                    }catch (Exception e)
                    {
                        result.setText("Please provide numbers in the inputs");
                    }
                }

            });

            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        double a = Double.parseDouble(numOne.getText().toString());
                        double b = Double.parseDouble(numTwo.getText().toString());
                        double res = a - b;
                        result.setText(Double.toString(res));
                    }catch (Exception e)
                    {
                        result.setText("Please provide numbers in the inputs");
                    }
                }
            });

            times.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        double a = Double.parseDouble(numOne.getText().toString());
                        double b = Double.parseDouble(numTwo.getText().toString());
                        double res = a * b;
                        result.setText(Double.toString(res));
                    }catch (Exception e)
                    {
                        result.setText("Please provide numbers in the inputs");
                    }
                }
            });

            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        double a = Double.parseDouble(numOne.getText().toString());
                        double b = Double.parseDouble(numTwo.getText().toString());
                        double res = a / b;
                        result.setText(Double.toString(res));
                    }catch (Exception e)
                    {
                        result.setText("Please provide numbers in the inputs");
                    }
                }
            });

    }

}