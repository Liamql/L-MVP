package com.example.administrator.l_mvp.di.component;

import com.example.administrator.l_mvp.MVP.ui.activity.MainActivity;
import com.example.administrator.l_mvp.di.module.UserModule;
import com.example.administrator.l_mvp.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Administrator on 2017/7/31 0031.
 */

@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
