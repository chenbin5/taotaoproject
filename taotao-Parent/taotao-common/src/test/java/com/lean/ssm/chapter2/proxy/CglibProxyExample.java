package com.lean.ssm.chapter2.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 10:37
 */
public class CglibProxyExample implements MethodInterceptor {


    /**
     * 生成CGLIB代理对象
     * @param cls Class对象
     * @return Class类的CGLIB代理对象
     */
    public Object getProxy(Class cls) {
        //CGLIB enhancer增强类对象
        Enhancer enhancer = new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(cls);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(this);
        //生成并返回代理对象
        return enhancer.create();

    }

    /**
     *
     * @param o 代理对象
     * @param method 方法
     * @param objects 方法参数
     * @param methodProxy 方法代理
     * @return 代理逻辑返回
     * @throws Throwable 异常
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        //CGLIB 反射调用真实对象方法
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("调用真实对象后");
        return result;
    }
}
