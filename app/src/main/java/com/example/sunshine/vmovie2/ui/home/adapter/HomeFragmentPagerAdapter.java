package com.example.sunshine.vmovie2.ui.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 2017/4/10.
 */

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> data;

    public HomeFragmentPagerAdapter(FragmentManager fm, List<Fragment> data) {
        super(fm);
        if (data != null) {
            this.data = data;
        } else {
            this.data = new ArrayList<>();
        }
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }
}
