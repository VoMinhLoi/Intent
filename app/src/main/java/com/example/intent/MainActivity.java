package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "nameColumn";
    public static final String MASV = "masvColumn";
    public static final String BUNDLE = "bundleColumn";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickMeBTAX = (Button) findViewById(R.id.clickMeBT);

        clickMeBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Minh Loi1";
                String masv = "2050531200226";
//                SetByExtra(name,masv);
                SetByBundle(name,masv);
            }
        });

    }
    public void SetByExtra(String name, String masv){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("nameColumn", name);
        intent.putExtra(MASV, masv);
        startActivity(intent);
    }
    public void SetByBundle(String name, String masv){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(NAME, name);
        bundle.putString("masvColumn", masv);
        intent.putExtra("bundleColumn", bundle);
        startActivity(intent);
    }
}