package com.myles.udacity.travelnanjing;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Qinhuai Renjia",
                "Eating in this two-story venue is strange but fun. After ordering from a menu full of set combos, waiters bring in more than a dozen small dishes, each holding a different snack, until the table is heaving with porcelain pots.\n\n"+
                "The star of the plate-driven feast is Qinhuai Eight Treasures (秦淮八绝), a dining concept featuring eight pairs of iconic eats that originated along the Qinhuai River. The 16 nibbles – half are dry dishes, others wet – are coupled by the restaurant to achieve the best gastronomic effect.\n\n" +
                "Examples of the delicious duos are shredded tofu in chicken broth served with a sesame pancake, and pan-fried beef dumplings paired with beef soup.",
                "Address: No. 128 Dashiba Road, Qinhuai District",
                "Phone: +86 25 5221 1888",
                "Website: www.mafengwo.cn/poi/4956.html",
                R.drawable.qinhuairenjia_thumbnail,
                R.drawable.qinhuairenjia));

        attractions.add(new Attraction("Confucius Temple",
                "In this tourist magnet also known as Fuzi Miao, eating is just as important as worshipping the great philosopher.\n\n"+
                "Squeeze into these ever-humming lanes to spot small but reputable shops, specializing in the snacks that express the city’s history.\n\n" +
                "Highlights include the dumplings in sweet red-bean soup from Lianhu Rice Cake Shop (莲湖糕团店), sesame pancakes from Qifangge (奇芳阁) and tofu jelly from Liufengju (六凤居).",
                "Address: Fuzi Miao, Metro Line 1 SanshanJie Station, Qinhuai District",
                "Phone: +86-",
                "Website: baike.baidu.com/view/53816.htm",
                R.drawable.confucius_temple_thumbnail,
                R.drawable.confucius_temple));


        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(QinhuaiFragment.this.getContext(), ItemActivity.class);
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
