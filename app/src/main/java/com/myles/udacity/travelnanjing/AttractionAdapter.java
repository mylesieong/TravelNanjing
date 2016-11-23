package com.myles.udacity.travelnanjing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by asus on 23/11/2016.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Context context, ArrayList<Attraction> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list_item, parent, false);
        }
        ((TextView)listItemView.findViewById(R.id.text_address)).setText(this.getItem(position).getAddress());
        ((TextView)listItemView.findViewById(R.id.text_name)).setText(this.getItem(position).getName());
        return listItemView;
    }
}
