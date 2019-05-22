package com.lean.ssm.chapter2.interceptor;

import com.lean.ssm.chapter2.proxy.HelloWorld;
import com.lean.ssm.chapter2.proxy.Impl.HelloWorldImpl;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 15:38
 */
public class InterceptorJdkProxy implements InvocationHandler {

    //真实对象
    private Object target;
    //拦截器全限定名
    private String interceptorClass = null;

    public InterceptorJdkProxy(Object target,String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 绑定委托对象并返回一个[代理占位]
     *
     * @param target 真实对象
     * @param interceptorClass 拦截器全限定名
     * @return 代理对象[占位]
     */
    public static Object bind(Object target,String interceptorClass) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target,interceptorClass));
    }

    /**
     * 通过代理对象调用方法，首先进入这个方法
     *
     * @param proxy 代理对象
     * @param method 方法，被调用的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (StringUtils.isEmpty(interceptorClass)) {
            //没有设置拦截器则直接反射原有方法
            return method.invoke(proxy,method);
        }
        Object result = null;
        //通过反射生成拦截器
        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();
        //调用前置方法
        if (interceptor.before(proxy,target,method,args)) {
            //反射原有对象的方法
            result = method.invoke(method,args);
        } else { //返回fasle执行around方法
            interceptor.around(proxy,target,method,args);
        }
        //调用后置方法
        interceptor.after(proxy,target,method,args);
        return result;
    }


    public static void main(String[] args) {
        HelloWorld proxy = (HelloWorld)InterceptorJdkProxy.bind(new HelloWorldImpl(),
                "com.lean.ssm.chapter2.interceptor.myinterceptor.MyInterceptor");
        proxy.sayHelloWorld();
    }
}
