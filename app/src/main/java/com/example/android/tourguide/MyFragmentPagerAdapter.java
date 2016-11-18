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
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        }else {
            return new ChurchFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_beach);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museum);
        } else {
            return mContext.getString(R.string.category_church);
        }
    }
}