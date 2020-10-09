package com.lnt.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton blue, yellow, green, red, pink;
    Button submit;
    String selectedColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blue = (RadioButton) findViewById(R.id.color1);
        yellow = (RadioButton) findViewById(R.id.color2);
        green = (RadioButton) findViewById(R.id.color3);
        red = (RadioButton) findViewById(R.id.color4);
        pink = (RadioButton) findViewById(R.id.color5);
        submit = (Button) findViewById(R.id.button2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blue.isChecked())
                {
                    selectedColor = blue.getText().toString();
                }
                else if (yellow.isChecked())
                {
                    selectedColor = yellow.getText().toString();
                }
                else if (green.isChecked())
                {
                    selectedColor = green.getText().toString();
                }
                else if (red.isChecked())
                {
                    selectedColor = red.getText().toString();
                }
                else if (pink.isChecked())
                {
                    selectedColor = pink.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selectedColor, Toast.LENGTH_LONG).show();
            }
        });
    }
}