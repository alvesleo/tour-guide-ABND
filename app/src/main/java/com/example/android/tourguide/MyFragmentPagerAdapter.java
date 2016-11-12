package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeachesFragment();
        } else{
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}