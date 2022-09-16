package com.example.intent;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView nameTVAX, masvTVAX;
    Button backBTAX;
    String iAX, masvAX;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        AnhXa();
//        GetByExtra(iAX, masvAX);
//        GetByBundle(iAX, masvAX);
        Intent intentAX = getIntent();
        iAX = intentAX.getStringExtra(MainActivity.NAME);
        masvAX = intentAX.getStringExtra(MainActivity.MASV);
        nameTVAX.setText(iAX);
        masvTVAX.setText(masvAX);

        backBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void AnhXa(){
        nameTVAX = (TextView) findViewById(R.id.nameTV);
        masvTVAX = (TextView ) findViewById(R.id.masvTV);
        backBTAX = (Button) findViewById(R.id.backBT);
    }
    public void GetByExtra(String iAX, String masvAX ){
        Intent intentAX = getIntent();
        iAX = intentAX.getStringExtra(MainActivity.NAME);
        masvAX = intentAX.getStringExtra(MainActivity.MASV);
    }
    public void GetByBundle(String iAX, String masvAX ){
        Intent intentAX = getIntent();
        Bundle bundle = intentAX.getBundleExtra(MainActivity.BUNDLE);
        iAX = bundle.getString(MainActivity.NAME);
        masvAX = bundle.getString(MainActivity.MASV);
    }
}
