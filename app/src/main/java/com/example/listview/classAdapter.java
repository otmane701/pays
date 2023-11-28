package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class classAdapter extends BaseAdapter {
    ArrayList data;
    Context context;

    public classAdapter(ArrayList data,Context context){
        this.data=data;
        this.context=context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(4);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        //v.findViewById(android.R.id.text1);
        if (v == null) {
            v = LayoutInflater.from(context).inflate(android.R.layout.select_dialog_singlechoice, null);
            //TextView tv=v.findViewById(R.id.text1);
            TextView tv = v.findViewById(android.R.id.text1);
            //tv.setText(data.get(position).toString());
            String txt=data.get(position).toString();
            tv.setText(txt);
        }

            return v;
        }

}
