package com.example.dasboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class HistoryActivity extends Activity {

    ListView simpleList;
    String List[] = {"Rent", "Return", "NearBy", "Histry"};
    int img [] = {R.drawable.phone, R.drawable.phone, R.drawable.phone, R.drawable.phone,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), List, img);
        simpleList.setAdapter(customAdapter);
    }
}
