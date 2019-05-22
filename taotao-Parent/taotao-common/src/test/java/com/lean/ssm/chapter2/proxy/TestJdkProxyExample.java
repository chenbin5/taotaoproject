package com.lean.ssm.chapter2.proxy;

import com.lean.ssm.chapter2.proxy.Impl.HelloWorldImpl;
import org.junit.Test;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 10:30
 */
public class TestJdkProxyExample {

    @Test
    public void testJdkProxy() {
        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        //绑定关系，因为挂载在HelloWorld下，所以声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld)jdkProxyExample.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();

    }
}
