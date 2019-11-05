package com.example.weidudmove.api;

import com.example.weidudmove.bean.Movebean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/*
 *@Auther:刘炳良
 *@Date: 时间
 *@Description:功能api请求网址
 * */public interface Api {
     @GET("movie/v2/findReleaseMovieList")
    Observable<Movebean> domove(@QueryMap Map<String,Integer>map);

}
