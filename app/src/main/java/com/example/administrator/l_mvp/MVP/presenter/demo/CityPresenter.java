package com.example.administrator.l_mvp.MVP.presenter.demo;

import android.app.Application;
import android.os.Handler;
import android.os.Message;

import com.example.administrator.l_mvp.MVP.contract.CityContract;
import com.example.administrator.l_mvp.MVP.presenter.BasePresenter;
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

    Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what)
            {
                case 1:
                    mRootView.showCity(msg.obj.toString());
                    break;
            }
        }
    };

    public void showCity()
    {
        mModel.getCity(mHandler);
    }
}
