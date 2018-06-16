package com.example.i.moontext.presenter;

import com.example.i.moontext.bean.CarBean;
import com.example.i.moontext.model.MyModel;
import com.example.i.moontext.model.MyModelCallBack;
import com.example.i.moontext.view.MyViewCallBack;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public class MyPresenter {
    MyModel myModel;
    MyViewCallBack myViewCallBack;

    public MyPresenter(MyViewCallBack myViewCallBack) {
        this.myModel = new MyModel();
        this.myViewCallBack = myViewCallBack;
    }
    public void select(){
        myModel.select(new MyModelCallBack() {
            @Override
            public void success(CarBean carBean) {
                myViewCallBack.success(carBean);
            }

            @Override
            public void failure() {
                myViewCallBack.failure();
            }
        });
    }
    public void detach(){
        this.myViewCallBack=null;
    }
}
