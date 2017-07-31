package com.example.administrator.l_mvp.MVP.presenter;

import android.app.Application;
import android.os.Message;

import com.example.administrator.l_mvp.MVP.contract.UserContract;
import com.example.administrator.l_mvp.MVP.model.User;
import com.example.administrator.l_mvp.app.base.AppManager;
import com.example.administrator.l_mvp.di.scope.ActivityScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/7/30 0030.
 */
@ActivityScope
public class UserPresenter extends BasePresenter<UserContract.Model, UserContract.View> {

    private AppManager mAppManager;
    private Application mApplication;
    private List<User> mUsers = new ArrayList<>();


    @Inject
    public UserPresenter(UserContract.Model model, UserContract.View rootView,
                AppManager appManager, Application application)
    {
        super(model, rootView);
        this.mApplication = application;
        this.mAppManager = appManager;
    }

    public void showUsers()
    {
        List<User> userList = mModel.getUsers();
        StringBuffer stringBuffer = new StringBuffer();
        for(User user : userList)
        {
            stringBuffer.append(user.toString());
        }
        mRootView.showUser(stringBuffer.toString());
    }

}
