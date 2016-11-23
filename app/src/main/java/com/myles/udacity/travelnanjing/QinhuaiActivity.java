package com.myles.udacity.travelnanjing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */

public class QinhuaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_qinhuai);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("father22","əpə"));
        attractions.add(new Attraction("mother22","əṭa"));
        attractions.add(new Attraction("son22","angsi"));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
