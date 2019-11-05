package com.example.weidudmove.presenter;

import com.example.weidudmove.base.Basepresenter;
import com.example.weidudmove.bean.Movebean;
import com.example.weidudmove.model.http.Httpuils;
import com.example.weidudmove.view.inteface.Mominteface;

import java.util.Map;

/*
 *@Auther:刘炳良
 *@Date: 时间
 *@Description:功能
 * */public class Movepresenter extends Basepresenter<Mominteface.domove> {
     public void domove(Map<String,Integer> map){
        Httpuils.getHttpuils().domove(map, new Httpuils.Domove<Movebean>() {

            @Override
            public void success(Movebean movebean) {
                getT().success(movebean);
            }
        });

     }
}
