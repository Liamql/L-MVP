package com.example.administrator.l_mvp.MVP.model.demo;

import android.os.Handler;
import android.os.Message;

import com.example.administrator.l_mvp.MVP.contract.CityContract;
import com.example.administrator.l_mvp.MVP.model.BaseModel;
import com.example.administrator.l_mvp.MVP.model.entity.City;
import com.example.administrator.l_mvp.MVP.model.service.CityService;
import com.example.administrator.l_mvp.app.base.IRepositoryManager;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class CityModel extends BaseModel implements CityContract.Model {

    String API_KEY = "8gqkro1pbbhh4ijm";


    @Inject
    public CityModel(IRepositoryManager repositoryManager){
        super(repositoryManager);
    }

    @Override
    public void getCity(final Handler handler) {

        Call<City> call = mRepositoryManager.obtainRetrofitService(CityService.class)
                .getCity(API_KEY,"shenzhen");
        call.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                Message msg = Message.obtain();
                msg.what =1;
                msg.obj = response.body().toString();
                handler.sendMessage(msg);
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {

            }
        });
    }
}
