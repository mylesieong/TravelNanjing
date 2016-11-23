package com.myles.udacity.travelnanjing;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */

public class GulouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulou);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("father","əpə"));
        attractions.add(new Attraction("mother","əṭa"));
        attractions.add(new Attraction("son","angsi"));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}
