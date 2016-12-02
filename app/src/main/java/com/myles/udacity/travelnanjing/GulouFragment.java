package com.myles.udacity.travelnanjing;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */

public class GulouFragment extends Fragment {

    public GulouFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Sancho Panza",
                "Local or international music bands strum out head-banging tunes every night at this subterranean space, connected to the real world by only a tiny flight of stairs in the Wutaishan Stadium complex.\n\n"+
                "Music genre varies from night to night but is largely focused on Rock, Country and Blues, according to the bartender. The underground live house is a regular stop for touring bands to set up shows in Nanjing.\n\n" +
                "It gets busy from around 9.00 p.m. when the daily concert starts. A pool table is tucked at the back of the bar for anyone who fancies a pre-concert warm-up.",
                "Address: 173 Guangzhou Lu, Gulou District",
                "Phone: +86 25 5188 8096",
                "Website: https://site.douban.com/don_quixote",
                R.drawable.sancho_panza_thumbnail,
                R.drawable.sancho_panza));

        attractions.add(new Attraction("Florentina",
                "It sounds surreal but it’s true: this cutely decorated house is the ultimate watering hole for Nanjing beer buffs.\n\n"+
                "The no-frills bar provides no food or live music, but bottle after bottle of good booze and a quiet environment for chatting. More than 100 imported brews are showcased neatly on a floor-to-ceiling shelf for selection. Most cost between RMB 25-40 (US$4-6.4).\n\n" +
                "The owner Tina Su (宿媛媛), a local in her mid-20s, says she opened this bar because she’d failed to find anything similar in Nanjing.",
                "Address: 83 Shanghai Road, Gulou District",
                "Phone: +86 186 0256 0788",
                "Website: www.dianping.com/search/branch/5/0_18052902/g0",
                R.drawable.florentina_thumbnail,
                R.drawable.florentina));

        attractions.add(new Attraction("Prime Restaurant and Bar Lounge",
                "Ascend cloud high for a posh experience of juicy steaks, wonderful wines, premium cigars and a panoramic view over the glittering downtown at this InterContinental bar.\n\n"+
                "cated on the 78th floor of 450-meter Zifeng Tower, this 150-seat establishment is the highest nightlife spot in the city and is a safe bet for impressing even the pickiest of bosses or travelling partners.\n\n" +
                "The well-stocked wine cellar gathers 10 different Champagnes as well as 50 types of white wine and 100 red wines from Europe, Oceania and South America.",
                "Address: 78/F, Intercontinental Nanjing, 1 Zhongyang Road, Gulou District",
                "Phone: +86 25 8353 8888",
                "Website: www.diningcity.cn/zh/nanjing/Prime_Restaurant_Bar_Lounge\n",
                R.drawable.prime_restaurant_bar_lounge_thumbnail,
                R.drawable.prime_restaurant_bar_lounge));

        attractions.add(new Attraction("Plum Garden",
                "No restaurant in town cooks better Huaiyang dishes, a regional cuisine from Nanjing and neighboring cities, than the Plum Garden. The 150-seat space in Jinling Hotel is where the local government sets up banquets for impressing visiting officials.\n\n"+
                "The layout and décor are exactly what you might expect of a classy Chinese restaurant: square mahogany chairs are placed carefully around big round tables covered with finely-woven tablecloths; potted pines and orchids adorn the marble-floored dining hall, which is divided into smaller sections by rosewood screens with exquisite carvings.\n\n" +
                "st dishes are light-flavoured and beautifully presented. Salted duck chops, or yanshuiya (盐水鸭, RMB 198 or US$32 per duck), is a star starter. Must-try hot dishes include tofu cooked with crab meat (蟹粉豆腐, RMB 188 or US$30) and de-shelled shrimps fried with gingko fruit (银杏虾仁, RMB 188 or US$30).",
                "Address: Plum Garden (??), 2/F, Jinling Hotel, 2 Hanzhong Road, Gulou District ",
                "Phone: +86 25 8471 1888 ext. 4204",
                "Website: www.jinlinghotel.com",
                R.drawable.plum_garden_thumbnail,
                R.drawable.plum_garden));

        attractions.add(new Attraction("Nanjing Impressions",
                "Almost every Nanjinger recommends this chained restaurant for authentic local fare, reasonable prices and unique ambience.\n\n"+
                "Two male doormen wearing traditional Chinese dress welcome diners with nostalgic sales pitches. The buzzing dining hall is a nod to the late Qing Dynasty, with paper lanterns hung across the ceiling, waiters and chefs donning period costumes and artists singing local opera.\n\n" +
                "Some 10 open kitchens occupy one side of the room. Cooks busy themselves from boiling sweet sticky-rice dumplings to frying stinky tofu to garnishing duck blood soup.",
                "Address: Multiple locations, Shiziqiao branch, No. 2 Shiziqiao, Gulou District",
                "Phone: +86 25 8330 5777",
                "Website: https://www.thebeijinger.com/directory/nanjing-impressions",
                R.drawable.nanjing_impressions_thumbnail,
                R.drawable.nanjing_impressions));

        AttractionAdapter itemsAdapter = new AttractionAdapter(this.getActivity(), attractions);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(GulouFragment.this.getContext(), ItemActivity.class);
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
