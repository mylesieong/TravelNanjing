package com.myles.udacity.travelnanjing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */

public class XuanwuFragment extends Fragment {

    public XuanwuFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("XF Book Store", "A special book store in Gulou district and also editor's favorite.",
                "Address: gulou distinct", "+86-21102244", "www.xfstore.cn", R.drawable.xf_thumbnail, R.drawable.xf));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(XuanwuFragment.this.getContext(), ItemActivity.class);
                intent.putExtra("name", attractions.get(i).getName());
                intent.putExtra("description", attractions.get(i).getDesciption());
                intent.putExtra("address", attractions.get(i).getAddress());
                intent.putExtra("phone", attractions.get(i).getPhone());
                intent.putExtra("website", attractions.get(i).getWebsite());
                intent.putExtra("thumbnail", attractions.get(i).getThumbnailResourceId());
                intent.putExtra("image", attractions.get(i).getImageResourceId());
                startActivity(intent);
            }
        });

        return rootView;
    }

}
