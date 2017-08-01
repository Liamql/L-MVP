package com.example.administrator.l_mvp.di.component;

import com.example.administrator.l_mvp.MVP.ui.activity.CityActivity;
import com.example.administrator.l_mvp.di.module.CityModule;
import com.example.administrator.l_mvp.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
@ActivityScope
@Component(modules = CityModule.class,dependencies = AppComponent.class)
public interface CityComponent {
    void inject(CityActivity activity);
}
