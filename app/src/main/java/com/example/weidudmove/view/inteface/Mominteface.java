package com.example.weidudmove.view.inteface;

import com.example.weidudmove.base.Baseinteface;
import com.example.weidudmove.bean.Movebean;

/*
 *@Auther:刘炳良
 *@Date: 时间
 *@Description:功能锲约接口
 * */public interface Mominteface {
     interface domove extends Baseinteface{
         void success(Movebean movebean);
     }
}
