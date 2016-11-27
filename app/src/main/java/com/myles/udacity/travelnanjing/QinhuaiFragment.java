package com.myles.udacity.travelnanjing;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */

public class QinhuaiFragment extends Fragment {

    public QinhuaiFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        //attractions.add(new Attraction("father22", "əpə"));
        //attractions.add(new Attraction("mother22", "əṭa"));
        //attractions.add(new Attraction("son22", "angsi"));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
