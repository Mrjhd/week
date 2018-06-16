package com.example.i.moontext.model;

import com.example.i.moontext.bean.CarBean;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public interface MyModelCallBack {
    public void success(CarBean carBean);
    public void  failure();
}
