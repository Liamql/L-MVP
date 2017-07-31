package com.example.administrator.l_mvp.MVP.presenter;

import com.example.administrator.l_mvp.MVP.model.IModel;
import com.example.administrator.l_mvp.MVP.ui.IView;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class BasePresenter<M extends IModel, V extends IView> implements IPresenter
{
    protected M mModel;
    protected V mRootView;

    public BasePresenter(M model, V rootView) {
        this.mModel = model;
        this.mRootView = rootView;
    }

    public BasePresenter(V rootView) {
        this.mRootView = rootView;
    }

}
