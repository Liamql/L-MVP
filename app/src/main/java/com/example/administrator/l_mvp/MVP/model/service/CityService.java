package com.example.administrator.l_mvp.MVP.model.service;

import com.example.administrator.l_mvp.MVP.model.entity.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public interface CityService {
    @GET("/v3/weather/now.json")
    Call<City> getCity(@Query("key")String key,@Query("location")String location);
}
