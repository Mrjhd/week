package com.example.i.moontext.model;

import com.example.i.moontext.bean.DeleteBean;
import com.example.i.moontext.utils.APIFactory;
import com.example.i.moontext.utils.AbstractObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 因为有个你i on 2018/5/31.
 */

public class MyModel2 {
    public void delete(String pid,final MyModelCallBack2 myModelCallBack2){
        final Map<String,String> map=new HashMap<>();
        map.put("source","android");
        map.put("pid",pid);
        map.put("uid","14927");
        APIFactory.getInstance().delete("/product/deleteCart", map, new AbstractObserver<DeleteBean>() {
            @Override
            public void onSuccess(DeleteBean deleteBean) {
                myModelCallBack2.success(deleteBean);
            }

            @Override
            public void onFailure() {

                myModelCallBack2.failure();
            }
        });
    }
}
