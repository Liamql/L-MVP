package com.example.administrator.l_mvp.di.module;

import com.example.administrator.l_mvp.MVP.contract.CityContract;
import com.example.administrator.l_mvp.MVP.contract.UserContract;
import com.example.administrator.l_mvp.MVP.model.CityModel;
import com.example.administrator.l_mvp.MVP.model.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
@Module
public class CityModule {

    private CityContract.View view;

    public CityModule(CityContract.View view)
    {
        this.view = view;
    }

    @Provides
    CityContract.View provideUserView(){
        return this.view;
    }

    @Provides
    CityContract.Model provideUserModel(CityModel model){
        return model;
    }
}
