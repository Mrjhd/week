package com.example.i.moontext.model;

import com.example.i.moontext.bean.CarBean;
import com.example.i.moontext.utils.APIFactory;
import com.example.i.moontext.utils.AbstractObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public class MyModel {
    public void select(final MyModelCallBack myModelCallBack){
        final Map<String,String> map=new HashMap<>();
        map.put("source","android");
        map.put("uid","14927");
        APIFactory.getInstance().select("/product/getCarts", map, new AbstractObserver<CarBean>() {
            @Override
            public void onSuccess(CarBean carBean) {
                myModelCallBack.success(carBean);
            }

            @Override
            public void onFailure() {

                myModelCallBack.failure();
            }
        });
    }
}
