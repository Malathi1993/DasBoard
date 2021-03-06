package com.example.dasboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String List[];
    int img[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] List, int[] img) {
        this.context = context;
        this.List = List;
        this.img = img;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return List.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.list_item, null);
        TextView list = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        list.setText(List[i]);
        icon.setImageResource(img[i]);
        return view;
    }
}
