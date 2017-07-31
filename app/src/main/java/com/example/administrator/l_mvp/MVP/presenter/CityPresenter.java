package com.example.administrator.l_mvp.MVP.presenter;

import android.app.Application;

import com.example.administrator.l_mvp.MVP.contract.CityContract;
import com.example.administrator.l_mvp.app.base.AppManager;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class CityPresenter extends BasePresenter<CityContract.Model,CityContract.View> {

    private AppManager mAppManager;
    private Application mApplication;

    @Inject
    public CityPresenter(CityContract.Model model,CityContract.View view,
                         Application application,AppManager appManager)
    {
        super(model,view);
        this.mApplication = application;
        this.mAppManager = appManager;
    }

    public void showCity()
    {
        String str = mModel.getCity();
        mRootView.showCity(str);
    }
}
