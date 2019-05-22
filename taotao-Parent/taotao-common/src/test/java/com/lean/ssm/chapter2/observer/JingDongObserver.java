package com.lean.ssm.chapter2.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 16:56
 */
public class JingDongObserver implements Observer {


    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.out.println("发送新产品【" + newProduct + "】同步到京东商城！！！");
    }
}
