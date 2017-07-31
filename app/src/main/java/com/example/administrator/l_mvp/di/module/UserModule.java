package com.example.administrator.l_mvp.di.module;

import com.example.administrator.l_mvp.MVP.contract.UserContract;
import com.example.administrator.l_mvp.MVP.model.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
@Module
public class UserModule {
    private UserContract.View view;

    /**
     * 构建UserModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     * @param view
     */
    public UserModule(UserContract.View view) {
        this.view = view;
    }

    @Provides
    UserContract.View provideUserView(){
        return this.view;
    }

    @Provides
    UserContract.Model provideUserModel(UserModel model){
        return model;
    }
}
