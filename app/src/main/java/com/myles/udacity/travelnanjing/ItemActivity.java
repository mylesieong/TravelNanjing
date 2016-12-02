package com.myles.udacity.travelnanjing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.BatchUpdateException;

/**
 * Created by asus on 27/11/2016.
 */

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent intent = this.getIntent();
        ((TextView)this.findViewById(R.id.text_name)).setText(intent.getStringExtra("name"));
        ((TextView)this.findViewById(R.id.text_description)).setText(intent.getStringExtra("description"));
        ((TextView)this.findViewById(R.id.text_address)).setText(intent.getStringExtra("address"));
        ((TextView)this.findViewById(R.id.text_phone)).setText(intent.getStringExtra("phone"));
        ((TextView)this.findViewById(R.id.text_website)).setText(intent.getStringExtra("website"));
        ((ImageView)this.findViewById(R.id.image)).setImageResource(intent.getIntExtra("image", 0));

    }

}
