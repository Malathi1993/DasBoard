package com.example.dasboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
CardView Rent;
CardView Return;
CardView NearBy;
CardView History;
Button Scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rent = (CardView) findViewById(R.id.card);
        Return = (CardView) findViewById(R.id.card1);
        NearBy = (CardView) findViewById(R.id.card2);
        History = (CardView) findViewById(R.id.card3);
        Scan =(Button)  findViewById(R.id.scan);

        Rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RentActivity.class);
                startActivity(intent);
            }
        });
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ReturnActivity.class);
                startActivity(intent);
            }
        });
        NearBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, NearByActivity.class);
                startActivity(intent);
            }
        });
        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HistoryActivity.class);
                startActivity(intent);
            }
        });
        Scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RentActivity.class);
                startActivity(intent);
            }
        });
    }
}
