package com.example.weidudmove.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
 *@Auther:刘炳良
 *@Date: 时间
 *@Description:功能
 * */public abstract class Baseactivity<T extends Basepresenter> extends AppCompatActivity implements Baseinteface {
     public T t;
    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initview());
        t=setpresenter();
        t.bind(this);
        bind = ButterKnife.bind(this);
        initdata();
        initlast();
    }
    abstract int initview();
    abstract void initdata();
    abstract void initlast();
    abstract T setpresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        t.unbind();
        bind.unbind();
    }
}
