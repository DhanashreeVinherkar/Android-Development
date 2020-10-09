package com.lnt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonClear, buttonEqual;
    TextView answerTV;
    float valueOne, valueTwo;
    boolean addition, Minus, multiplication, division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonMinus);
        answerTV = (TextView) findViewById(R.id.textView);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText(answerTV.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //text.setText("0");
                //text.setText(text.getText()+"+");
                if (answerTV.getText().toString().length() <= 0)
                {
                    answerTV.setText("");
                }
                else {
                    valueOne = Float.parseFloat(answerTV.getText() + "");
                    addition = true;
                    answerTV.setText("");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTV.getText().toString().length() <= 0)
                {
                    answerTV.setText("");
                }
                else {
                    valueOne = Float.parseFloat(answerTV.getText() + "");
                    Minus = true;
                    answerTV.setText("");
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTV.getText().toString().length() <= 0)
                {
                    answerTV.setText("");
                }
                else {
                    valueOne = Float.parseFloat(answerTV.getText() + "");
                    multiplication = true;
                    answerTV.setText("");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTV.getText().toString().length() <= 0)
                {
                    answerTV.setText("");
                }
                else {
                    valueOne = Float.parseFloat(answerTV.getText() + "");
                    division = true;
                    answerTV.setText("");
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerTV.getText().toString().length() <= 0)
                {
                    answerTV.setText("");
                }
                else {
                    valueTwo = Float.parseFloat(answerTV.getText() + "");
                    if (addition == true) {
                        answerTV.setText(valueOne + valueTwo + "");
                        addition = false;
                    }
                    if (Minus == true) {
                        answerTV.setText(valueOne - valueTwo + "");
                        Minus = false;
                    }
                    if (multiplication == true) {
                        answerTV.setText(valueOne * valueTwo + "");
                        multiplication = false;
                    }
                    if (division == true) {
                        answerTV.setText(valueOne / valueTwo + "");
                        division = false;
                    }
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTV.setText("0");
            }
        });

    }
}