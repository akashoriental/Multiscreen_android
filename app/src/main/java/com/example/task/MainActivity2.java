package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        display=findViewById(R.id.diasplay);
        Intent intent = getIntent();
        String name=intent.getStringExtra(MainActivity.Keyname);
        display.setText("Hello there "+name);
    }
}