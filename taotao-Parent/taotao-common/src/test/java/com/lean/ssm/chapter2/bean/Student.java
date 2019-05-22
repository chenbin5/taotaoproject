package com.lean.ssm.chapter2.bean;

import java.io.Serializable;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/21 21:47
 */
public class Student implements Serializable {

    private String sno;
    private String sname;
    private Integer age;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
