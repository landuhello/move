package com.example.weidudmove.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.weidudmove.R;
import com.example.weidudmove.view.adapter.Moveadapter;
import com.example.weidudmove.view.fragment.Fragmentmove;
import com.example.weidudmove.view.fragment.Fragmentmoveh;
import com.example.weidudmove.view.fragment.Fragmentmy;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.move_vp)
    ViewPager moveVp;
    @BindView(R.id.move_tab)
    TabLayout moveTab;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initview();
    }

    private void initview() {
        list = new ArrayList<>();
        list.add(new Fragmentmove());
        list.add(new Fragmentmoveh());
        list.add(new Fragmentmy());
        Moveadapter moveadapter = new Moveadapter(getSupportFragmentManager(), list);
        moveVp.setAdapter(moveadapter);
        moveTab.setupWithViewPager(moveVp);
        moveTab.getTabAt(0).setIcon(R.drawable.movie);
        moveTab.getTabAt(1).setIcon(R.drawable.cinema);
        moveTab.getTabAt(2).setIcon(R.drawable.my);
    }
}
