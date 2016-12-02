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

public class BaixiaFragment extends Fragment {

    public BaixiaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Mingwalang",
                "An offshoot from Nanjing’s busiest crossroads, Xinjiekou, the noisy, pungent and lively alleyway  forks over a wide array of cook-before-your-eyes delicacies to leave even a seasoned gourmet spoilt for choice.\n\n"+
                "The roughly 200-meter road starts near Shigu Road with booths selling everything from grilled octopus skewers to fried chicken wings to egg pancakes.\n\n" +
                "Sauntering further down, there are a number of sit-down restaurants, each enjoying a legendary reputation in Nanjing.\n\n" +
                "YijiPidu Noodles serves massive bowls of noodles topped with sliced, deep-fried pig skin. Next to it, Bianrou Wonton boils  Fujian-style purse-shaped dumplings with crunchy fillings. LaotouGai Jiao Fan is the stop for rice devotees.\n\n" +
                "South to Mingwalang is Daxianglu, a laid-back street-market with vendors pitching marinated duck necks or frying tofu skins from home stores.",
                "Address: Mingwalang Food Street, between Shigu Road and Sanyuan Xiang, Baixia District",
                "Phone: +86-",
                "Website: http://baike.baidu.com/view/10298113.htm",
                R.drawable.mingwalang_thumbnail,
                R.drawable.mingwalang));

        attractions.add(new Attraction("Wuchaomen Park",
                "Every morning, retired locals practice tai chi, sing opera and walk backwards in circles in what was once the forbidden grounds of the Ming Palace.\n\n"+
                "Inside the park stands Wumen, one of Nanjing’s few remaining palace gates, dating back to 1367. Visitors can climb the grey-bricked structure to experience a good view over Yudao to the south, the straight and tree-lined former imperial road.\n\n" +
                "Wuchaomen is also ground zero for Nanjing’s saxophone association. Fans of the western instrument, mostly elderly retirees, gather here every day to chat and practice.",
                "Address: 28 Yudao Road, Baixia District",
                "Phone: +86-",
                "Website: http://baike.baidu.com/view/599094.htm",
                R.drawable.wuchaomen_park_thumbnail,
                R.drawable.wuchaomen_park));

        attractions.add(new Attraction("Jimmy’s",
                "Hidden at the end of a food and drink complex on Shigu Road, this six-year-old sports bar plants a chunk of America in the heart of Nanjing.\n\n"+
                "Owned by Tennessee-native Jimmy, this laid-back pub is a nightlife stronghold among Nanjing expats, serving domestic and imported beers, a sociable environment and possibly the best American-style pizza in town.\n\n" +
                "Half a dozen TV sets are hung around the 100-square-metre brown-bricked space, broadcasting various sports games through international channels.\n\n" +
                "Beer costs around RMB 25 (US$) per bottle or RMB 30 (US$4.8) on tap. A 12-inch pizza is about RMB 85 (US$13.6).",
                "Address: 193 Shigu Road, Baixia District",
                "Phone: +86 25 8679 2599",
                "Website: http://jimmysnj.com/",
                R.drawable.jimmy_thumbnail,
                R.drawable.jimmy));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BaixiaFragment.this.getContext(), ItemActivity.class);
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
