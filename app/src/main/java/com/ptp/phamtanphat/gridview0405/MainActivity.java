package com.ptp.phamtanphat.gridview0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter arrayAdapter;
    ArrayList<Integer> manghinhanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView =  findViewById(R.id.gridview);

        manghinhanh = new ArrayList<>();

        manghinhanh.add(R.mipmap.ic_launcher);
        manghinhanh.add(R.mipmap.ic_launcher);
        manghinhanh.add(R.mipmap.ic_launcher);
        manghinhanh.add(R.mipmap.ic_launcher);
        manghinhanh.add(R.mipmap.ic_launcher);
        manghinhanh.add(R.mipmap.ic_launcher);

        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,manghinhanh);

        gridView.setAdapter(arrayAdapter);

    }
}
