package com.lnt.newmulti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.lnt.newmulti.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMyMessage(View view)
    {
        Intent intent = new Intent(this, ActivityDisplayMessage.class); //destination is second activity name with extension .class
        EditText send = (EditText) findViewById(R.id.editTextTextPersonName2);
        String message = send.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}