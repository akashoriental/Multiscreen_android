package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt;
    Button bt2;
    EditText data;
    public static final String Keyname = "com.example.multiscreen.data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        data=findViewById(R.id.editTextTextPersonName);
        bt.setOnClickListener(v -> openNext());
        bt2.setOnClickListener(
                v -> searchUrl()
        );
    }
    public void openNext(){
        Toast.makeText(MainActivity.this,"Opening next page",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        String passdata=data.getText().toString();
        intent.putExtra(Keyname,passdata);
        startActivity(intent);
    }
    @SuppressLint("QueryPermissionsNeeded")
    public void searchUrl(){
        Toast.makeText(MainActivity.this,"Opening link",Toast.LENGTH_SHORT).show();
        String passdata=data.getText().toString();
        Uri webpage=Uri.parse(passdata);
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(webpage);
//        try {
//            if (intent.resolveActivity(getPackageManager()) != null) {
//                System.out.println("djbvcjdn");
//                startActivity(intent);
//            }
//        }
//        catch (Exception e){
//            System.out.println("error");
//            System.out.println(e);
//        }
        startActivity(intent);
    }
}