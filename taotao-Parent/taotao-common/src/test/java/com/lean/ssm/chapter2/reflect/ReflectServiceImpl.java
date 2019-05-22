package com.lean.ssm.chapter2.reflect;

/**
 * @author 陈斌
 * @Description 学习反射
 * @date 2019/5/21 21:26
 */
public class ReflectServiceImpl {

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static ReflectServiceImpl getInstance() {
        ReflectServiceImpl reflectServiceImpl = null;
        try {
            reflectServiceImpl = (ReflectServiceImpl)Class.forName("com.lean.ssm.chapter2.reflect.ReflectServiceImpl")
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reflectServiceImpl;
    }

    /*public static void main(String[] args) {
        ReflectServiceImpl reflectService = getInstance();
        System.out.println(reflectService);
    }*/
}
