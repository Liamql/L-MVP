package com.example.administrator.l_mvp.MVP.model;

import com.example.administrator.l_mvp.MVP.contract.CityContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class CityModel implements CityContract.Model {

    @Inject
    CityModel(){}

    @Override
    public String getCity() {



        return "666";
    }
}
