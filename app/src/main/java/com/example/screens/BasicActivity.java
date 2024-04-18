package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BasicActivity extends AppCompatActivity {

    Bundle extras;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        textView = findViewById(R.id.textView);
        extras = getIntent().getExtras();
        if (extras != null) {
            String message = extras.getString("message");
            textView.setText(message);
        }
    }
}