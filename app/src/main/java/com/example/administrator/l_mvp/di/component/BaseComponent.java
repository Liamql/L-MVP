package com.example.administrator.l_mvp.di.component;

import android.app.Application;

import com.example.administrator.l_mvp.app.base.AppManager;
import com.example.administrator.l_mvp.app.base.BaseApplication;
import com.example.administrator.l_mvp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
@Singleton
@Component(modules={AppModule.class})
public interface BaseComponent {
    void inject(BaseApplication application);
}