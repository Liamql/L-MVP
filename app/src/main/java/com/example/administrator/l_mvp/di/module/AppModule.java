package com.example.administrator.l_mvp.di.module;

import android.app.Application;

import com.example.administrator.l_mvp.app.base.BaseActivity;

import java.util.LinkedList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/7/30 0030.
 */
@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

}
