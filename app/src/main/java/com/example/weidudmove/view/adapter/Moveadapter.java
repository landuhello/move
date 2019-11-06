package com.example.weidudmove.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/*
 *@Auther:刘炳良
 *@Date: 时间
 *@Description:功能
 * */public class Moveadapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public Moveadapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
