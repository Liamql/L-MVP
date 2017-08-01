package com.example.administrator.l_mvp.app.base;

/**
 * Created by jess on 17/03/2017 11:15
 * Contact with jess.yan.effort@gmail.com
 */

public interface IRepositoryManager {

    <T> T obtainRetrofitService(Class<T> service);

}
