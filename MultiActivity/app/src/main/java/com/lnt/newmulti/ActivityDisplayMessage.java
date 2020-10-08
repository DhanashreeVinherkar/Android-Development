package com.lnt.newmulti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDisplayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String receivedMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView receive = findViewById(R.id.message);
        receive.setText(receivedMessage);
    }
}