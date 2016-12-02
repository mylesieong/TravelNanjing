package com.myles.udacity.travelnanjing;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Attraction} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GulouFragment();
        } else if (position == 1) {
            return new QinhuaiFragment();
        }else if (position == 2 ) {
            return new BaixiaFragment();
        }else if (position ==3 ){
            return new XuanwuFragment();
        }else{
            return null;
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Gu Lou";
        } else if (position == 1) {
            return "Qin Huai";
        }else if (position ==2){
            return "Bai Xia";
        }else if (position==3) {
            return "Xuan Wu";
        }else{
            return null;
        }
    }
}
