package com.lean.ssm.chapter2.observer;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 17:02
 */
public class TestObserver {

    public static void main(String[] args) {

        ProductList productList = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        productList.addObserver(taoBaoObserver);
        productList.addObserver(jingDongObserver);
        productList.addProduct("测试新增产品1");
    }
}
