package com.example.sunshine.vmovie2.api;


import com.example.sunshine.vmovie2.constant.HttpParams;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sunshine on 2017/4/10.
 */

public class Api {
    private static ApiService apiService;

    public static ApiService getApiService(){
        if (apiService == null) {
            initApiService();
        }
        return apiService;
    }

    private  static  void initApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HttpParams.VM_HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        apiService=retrofit.create(ApiService.class);
    }

}
