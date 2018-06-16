package com.example.i.moontext.utils;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public interface IGetService {
    @GET
    Observable<String> select(@Url String url, @QueryMap Map<String,String> map);
    @GET
    Observable<String> delete(@Url String url, @QueryMap Map<String,String> map);
    @GET
    Observable<String> update(@Url String url, @QueryMap Map<String,String> map);

}
