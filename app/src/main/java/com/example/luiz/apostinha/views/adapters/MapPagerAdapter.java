package com.example.luiz.apostinha.views.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.luiz.apostinha.fragments.NowMapFragment;
import com.example.luiz.apostinha.fragments.OneDayMapFragment;
import com.example.luiz.apostinha.fragments.OneHourMapFragment;
import com.example.luiz.apostinha.fragments.ThirdMinutesMapFragment;
import com.example.luiz.apostinha.fragments.TwelveHoursMapFragment;

/**
 * Created by luiz on 4/15/16.
 */
public class MapPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public MapPagerAdapter(Context context, FragmentManager fragmentManager)
    {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0: return NowMapFragment.newInstance();
            case 1: return ThirdMinutesMapFragment.newInstance();
            case 2: return OneHourMapFragment.newInstance();
            case 3: return TwelveHoursMapFragment.newInstance();
            case 4: return OneDayMapFragment.newInstance();

            default: return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        switch(position)
        {
            case 0: return "Now";
            case 1: return "30 min";
            case 2: return "1 hour";
            case 3: return "12 hour";
            case 4: return "1 day";

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
