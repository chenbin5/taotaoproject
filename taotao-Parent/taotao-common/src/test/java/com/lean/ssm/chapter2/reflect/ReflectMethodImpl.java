package com.lean.ssm.chapter2.reflect;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description 反射方法
 * @date 2019/5/21 21:55
 */
public class ReflectMethodImpl {

    public static Object reflectMethod() {
        Object returnObj = null;
        ReflectServiceImpl reflectServiceImpl = new ReflectServiceImpl();
        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(reflectServiceImpl,"张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    public static void main(String[] args) {
        reflectMethod();
    }
}
