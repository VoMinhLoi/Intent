package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "infor";
    public static final String MASV = "masv";
    public static final String BUNDLE = "bundle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickMeBTAX = (Button) findViewById(R.id.clickMeBT);
        String name = "Minh Loi - ";
        String masv = "2050531200226";
        clickMeBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               SetByExtra(name, masv);
//                SetByBundle(name, masv);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(NAME, name);
                intent.putExtra(MASV, masv);
                startActivity(intent);
            }
        });

    }
    public void SetByExtra(String name, String masv){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(NAME, name);
        intent.putExtra(MASV, masv);
        startActivity(intent);
    }
    public void SetByBundle(String name, String masv){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(NAME, name);
        bundle.putString(MASV, masv);
        intent.putExtra(BUNDLE, bundle);
        startActivity(intent);
    }
}