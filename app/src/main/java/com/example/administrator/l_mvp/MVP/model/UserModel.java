package com.example.administrator.l_mvp.MVP.model;

import com.example.administrator.l_mvp.MVP.contract.UserContract;
import com.example.administrator.l_mvp.di.scope.ActivityScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


/**
 * Created by Administrator on 2017/7/31 0031.
 */
@ActivityScope
public class UserModel implements UserContract.Model {

    @Inject
    UserModel(){}

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("a","123"));
        userList.add(new User("b","456"));
        return userList;
    }
}
