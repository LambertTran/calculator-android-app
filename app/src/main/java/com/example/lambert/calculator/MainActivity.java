package com.example.lambert.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity  {

    double num1,num2, result;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);

        final Button btn0 = (Button) findViewById(R.id.btn0);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);
        final Button btn5 = (Button) findViewById(R.id.btn5);
        final Button btn6 = (Button) findViewById(R.id.btn6);
        final Button btn7 = (Button) findViewById(R.id.btn7);
        final Button btn8 = (Button) findViewById(R.id.btn8);
        final Button btn9 = (Button) findViewById(R.id.btn9);
        final Button dotBtn = (Button) findViewById(R.id.dotBtn);

        final Button clearBtn = (Button) findViewById(R.id.clearBtn);
        final Button timeBtn = (Button) findViewById(R.id.timeBtn);
        final Button divBtn = (Button) findViewById(R.id.divBtn);
        final Button plusBtn = (Button) findViewById(R.id.plusBtn);
        final Button minusBtn = (Button) findViewById(R.id.minusBtn);
        final Button equalBtn = (Button) findViewById(R.id.equalBtn);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn0.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn1.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn2.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn3.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn4.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn5.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn6.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn7.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn8.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn9.getText().toString();
                editText.setText(editText.getText()  + text);
            }
        });


        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = dotBtn.getText().toString();
                editText.setText(editText.getText() + text);
            }
        });


        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(editText.getText().toString());
                operation = timeBtn.getText().charAt(0);
                editText.setText("");
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(editText.getText().toString());
                operation = divBtn.getText().charAt(0);
                editText.setText("");
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(editText.getText().toString());
                operation = plusBtn.getText().charAt(0);
                editText.setText("");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(editText.getText().toString());
                operation = minusBtn.getText().charAt(0);
                editText.setText("");
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(editText.getText().toString());
                switch (operation) {
                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                        result = num1 / num2;
                        break;

                    case '+':
                        result = num1 + num2;
                        break;

                    case '-':
                        result = num1  - num2;
                        break;


                }
            editText.setText(String.valueOf(result));
            }
        });





    }



}
