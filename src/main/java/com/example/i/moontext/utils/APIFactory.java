package com.example.i.moontext.utils;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public class APIFactory {

    private static APIFactory factory = null;

    public static APIFactory getInstance(){
        if(factory==null){
            synchronized (APIFactory.class){
                if(factory==null){
                    factory = new APIFactory();

                }
            }
        }
        return factory;
    }


    public void select(String url, Map<String,String> map, Observer<String> observer){

        RetrofitUtils.getInstance().select(url,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }


    public void delete(String url, Map<String,String> map, Observer<String> observer){

        RetrofitUtils.getInstance().select(url,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
