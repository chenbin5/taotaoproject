package com.lean.ssm.chapter2.interceptor;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description 拦截器学习
 * @date 2019/5/22 15:31
 */
public interface Interceptor {


    /**
     *
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method method方法
     * @param args 参数列表
     * @return
     */
    public boolean before(Object proxy, Object target, Method method,Object[] args);

    public void around(Object proxy,Object target,Method method,Object[] args);

    public void after(Object proxy,Object target,Method method,Object[] args);
}
