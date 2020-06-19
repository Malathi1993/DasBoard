package com.example.dasboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RentActivity extends AppCompatActivity {
TextView Rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        Rent =(TextView)findViewById(R.id.textView3);
    }
}
