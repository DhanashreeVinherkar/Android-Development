package com.lnt.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "Day = "+simpleDatePicker.getDayOfMonth();
                String month = "Month = "+(simpleDatePicker.getMonth()+1);
                String year = "Year = "+simpleDatePicker.getYear();

                Toast.makeText(getApplicationContext(), day + "\n" + month+ "\n" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}