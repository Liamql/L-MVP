package com.example.administrator.l_mvp.MVP.contract;

import com.example.administrator.l_mvp.MVP.model.IModel;
import com.example.administrator.l_mvp.MVP.model.User;
import com.example.administrator.l_mvp.MVP.ui.IView;

import java.util.List;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public interface CityContract {

    interface View extends IView {

        void showCity(String str);
    }
    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        String getCity();
    }
}
