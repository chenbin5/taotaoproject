package com.lean.ssm.chapter2.proxy;

import com.lean.ssm.chapter2.reflect.ReflectServiceImpl;
import org.junit.Test;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/22 10:57
 */
public class TestCglibProxyExample {


    @Test
    public void testCglibProxy() {

        CglibProxyExample cglibProxyExample = new CglibProxyExample();
        ReflectServiceImpl reflectService = (ReflectServiceImpl)cglibProxyExample.getProxy(ReflectServiceImpl.class);
        reflectService.sayHello("张三");

    }
}
