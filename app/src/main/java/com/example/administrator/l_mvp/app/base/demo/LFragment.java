package com.example.administrator.l_mvp.app.base.demo;


import com.example.administrator.l_mvp.MVP.presenter.IPresenter;
import com.example.administrator.l_mvp.app.base.BaseFragment;
import com.example.administrator.l_mvp.di.component.AppComponent;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public abstract class LFragment<P extends IPresenter> extends BaseFragment<P> {

    protected LApplication mLApplication;

    protected LActivity lActivity;

    @Override
    protected void ComponentInject() {
        mLApplication = (LApplication) mContext.getApplicationContext();
        lActivity = (LActivity) mContext;
        setupFragmentComponent(mLApplication.getAppComponent());
    }
    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupFragmentComponent(AppComponent appComponent);
}
