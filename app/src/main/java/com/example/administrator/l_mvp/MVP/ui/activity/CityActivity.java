package com.example.administrator.l_mvp.MVP.ui.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.l_mvp.MVP.contract.CityContract;
import com.example.administrator.l_mvp.MVP.presenter.demo.CityPresenter;
import com.example.administrator.l_mvp.R;
import com.example.administrator.l_mvp.app.base.demo.LActivity;
import com.example.administrator.l_mvp.di.component.AppComponent;
import com.example.administrator.l_mvp.di.component.DaggerCityComponent;
import com.example.administrator.l_mvp.di.module.demo.CityModule;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class CityActivity extends LActivity<CityPresenter> implements CityContract.View {

    @BindView(R.id.am_tv)
    TextView tv;

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerCityComponent.builder()
                .appComponent(appComponent)
                .cityModule(new CityModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected View initView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_main,null,false);
    }

    @Override
    protected void initData() {
        mPresenter.showCity();
    }

    @Override
    public void showCity(String str) {
        tv.setText(str);
    }
}
