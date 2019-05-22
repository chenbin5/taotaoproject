package com.lean.ssm.chapter2.responsible;

import com.lean.ssm.chapter2.interceptor.InterceptorJdkProxy;
import com.lean.ssm.chapter2.proxy.HelloWorld;
import com.lean.ssm.chapter2.proxy.Impl.HelloWorldImpl;

/**
 * @author 陈斌
 * @Description 测试责任链模式
 * @date 2019/5/22 16:30
 */
public class TestReponsible {

    public static void main(String[] args) {

        HelloWorld proxy1 = (HelloWorld)InterceptorJdkProxy.bind(
                new HelloWorldImpl(),"com.lean.ssm.chapter2.responsible.Interceptor1");
        HelloWorld proxy2 = (HelloWorld)InterceptorJdkProxy.bind(
                proxy1,"com.lean.ssm.chapter2.responsible.Interceptor2");
        HelloWorld proxy3 = (HelloWorld)InterceptorJdkProxy.bind(
                proxy2,"com.lean.ssm.chapter2.responsible.Interceptor3");
        proxy3.sayHelloWorld();
    }
}
