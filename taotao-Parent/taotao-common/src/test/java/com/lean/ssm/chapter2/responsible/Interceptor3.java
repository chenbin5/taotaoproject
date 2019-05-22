package com.lean.ssm.chapter2.responsible;

import com.lean.ssm.chapter2.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 16:29
 */
public class Interceptor3 implements Interceptor {

    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器3】的before方法");
        return true;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {

    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器3】的after方法");
    }
}
