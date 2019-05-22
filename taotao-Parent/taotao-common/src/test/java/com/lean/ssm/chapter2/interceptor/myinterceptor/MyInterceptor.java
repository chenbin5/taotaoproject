package com.lean.ssm.chapter2.interceptor.myinterceptor;

import com.lean.ssm.chapter2.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 15:34
 */
public class MyInterceptor implements Interceptor {

    /**
     *
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method method方法
     * @param args 参数列表
     * @return
     */
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法之前的逻辑");
        return false;
    }


    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后的逻辑");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }
}
