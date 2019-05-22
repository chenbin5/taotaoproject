package com.lean.ssm.chapter2.reflect;

import java.lang.reflect.Method;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/21 22:03
 */
public class ReflectMethodImpl1 {

    public static Object reflect() {

        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl)Class.forName("com.lean.ssm.chapter2.reflect.ReflectServiceImpl")
                    .newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object,"张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        reflect();
    }
}
