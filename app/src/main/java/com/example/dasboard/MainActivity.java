package com.example.dasboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
CardView Rent;
CardView Return;
CardView NearBy;
CardView History;
Button Scan;

   // ListView simpleList;
    //String List[] = {"Rent", "Return", "NearBy", "Histry"};
   // int img [] = {R.drawable.phone, R.drawable.phone, R.drawable.phone, R.drawable.phone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // simpleList = (ListView) findViewById(R.id.simpleListView);
       // CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), List, img);
       // simpleList.setAdapter(customAdapter);



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
