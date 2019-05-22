package com.lean.ssm.chapter2.reflect;


/**
 * @author 陈斌
 * @Description 通过构造器获取类对象
 * @date 2019/5/21 21:36
 */
public class ReflectServiceImpl2 {

    private String name;

    public ReflectServiceImpl2(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static ReflectServiceImpl2 getInstance() {
        ReflectServiceImpl2 reflectServiceImpl2 = null;
        try {
            reflectServiceImpl2 = (ReflectServiceImpl2)Class.forName("com.lean.ssm.chapter2.reflect.ReflectServiceImpl2")
                    .getConstructor(String.class).newInstance("张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reflectServiceImpl2;
    }

    public static void main(String[] args) {
        ReflectServiceImpl2 reflectServiceImpl2 = getInstance();
        reflectServiceImpl2.sayHello();
    }
}
