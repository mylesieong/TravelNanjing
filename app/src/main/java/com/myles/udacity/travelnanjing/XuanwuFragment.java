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
        attractions.add(new Attraction("Zuo Bar",
                "Delivering top-notch cocktails and fine service in a cosy environment, the 50-square-metre bar is the place to go for a classy sip outside glitzy hotels.\n\n"+
                "The menu comprises simple finger food and some 50 drinks choices with different bases of liquor, including whiskey, vodka, gin and tequila.\n\n" +
                "Waist-coated Chinese bartenders, trained by the bar’s Japanese owner, mix concoctions in front of a large wall of alcohol which displays more than 100 bottles of firewater from around the world.",
                "Address: 2/F, Building A2, 1912 compound, 54 North Taiping Road, Xuanwu District ",
                "Phone: +86 25 8664 3100",
                "Website: www.drinkmagazine.asia/2015/07/21/made-in-china-zuo-bar",
                R.drawable.zuo_bar_thumbnail,
                R.drawable.zuo_bar));

        attractions.add(new Attraction("Xuanwu Lake Park",
                "Just a few steps away from commercial thoroughfares, this former imperial lake garden ushers city dwellers from the urban hustle and bustle into a peaceful haven of weeping willows, arch bridges, paddle boats and visually stunning flowers.\n\n"+
                "Whatever the season, the 4.4 square-kilometre park showcases a distinctive colour: pink cherry blossoms in spring, emerald lotus leaves in summer, golden ginkgos and red maples in autumn, and snow-covered pines in winter.\n\n" +
                "Much of Nanjing’s downtown is built around this massive, smooth body of water. A casual stroll around the lake and through its five islands – all connected by bridges -- can take up to five hours.",
                "Address: Various gates. The main one is Xuanwu Gate, near Metro Line 1 Xuanwumen Station",
                "Phone: +86-",
                "Website: baike.baidu.com/view/7964.htm",
                R.drawable.xuanwu_lake_park_thumbnail,
                R.drawable.xuanwu_lake_park));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(XuanwuFragment.this.getContext(), ItemActivity.class);
                intent.putExtra(getString(R.string.intent_extra_name), attractions.get(i).getName());
                intent.putExtra(getString(R.string.intent_extra_description), attractions.get(i).getDesciption());
                intent.putExtra(getString(R.string.intent_extra_address), attractions.get(i).getAddress());
                intent.putExtra(getString(R.string.intent_extra_phone), attractions.get(i).getPhone());
                intent.putExtra(getString(R.string.intent_extra_website), attractions.get(i).getWebsite());
                intent.putExtra(getString(R.string.intent_extra_thumbnail), attractions.get(i).getThumbnailResourceId());
                intent.putExtra(getString(R.string.intent_extra_image), attractions.get(i).getImageResourceId());
                startActivity(intent);
            }
        });

        return rootView;
    }

}
