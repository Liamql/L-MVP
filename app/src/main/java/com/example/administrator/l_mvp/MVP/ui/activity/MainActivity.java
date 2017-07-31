package com.example.administrator.l_mvp.MVP.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


import com.example.administrator.l_mvp.MVP.contract.UserContract;
import com.example.administrator.l_mvp.MVP.model.User;
import com.example.administrator.l_mvp.MVP.presenter.UserPresenter;
import com.example.administrator.l_mvp.app.base.BaseActivity;
import com.example.administrator.l_mvp.R;
import com.example.administrator.l_mvp.app.base.LActivity;
import com.example.administrator.l_mvp.di.component.AppComponent;
//import com.example.administrator.l_mvp.di.component.DaggerUserComponent;
import com.example.administrator.l_mvp.di.component.DaggerUserComponent;
import com.example.administrator.l_mvp.di.module.UserModule;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/7/30 0030.
 */
public class MainActivity extends LActivity<UserPresenter> implements UserContract.View {

    @BindView(R.id.am_tv)
    TextView tv;

    @Override
    public View initView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_main,null,false);
    }

    @Override
    public void initData() {
        tv.setText("666");
        mPresenter.showUsers();
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent)
    {
        DaggerUserComponent.builder()
                .appComponent(appComponent)
                .userModule(new UserModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void showUser(String str) {
        tv.setText(str);
    }
}
