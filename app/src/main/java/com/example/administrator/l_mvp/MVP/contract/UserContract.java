package com.example.administrator.l_mvp.MVP.contract;

import com.example.administrator.l_mvp.MVP.model.IModel;
import com.example.administrator.l_mvp.MVP.model.User;
import com.example.administrator.l_mvp.MVP.ui.IView;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public interface UserContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {

        void showUser(String str);
    }
    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        List<User> getUsers();
    }
}
