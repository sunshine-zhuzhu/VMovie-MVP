package com.example.sunshine.vmovie2.api;


import com.example.sunshine.vmovie2.bean.SeriesData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by sunshine on 2017/4/10.
 */

public interface ApiService {
    //系列页面接口
    // http://app.vmoiver.com/apiv3/series/getList?p=1
    @GET("/apiv3/series/getList")
    Observable<SeriesData> getSeriesData(@Query("p") int p);


}
