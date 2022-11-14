package com.java.demo;

public class Student {
    /*学习构造函数：*/
    private int age;
    private String name;

    //声明无参构造方法
    public Student() {

    }

    //声明有参构造方法 作用：给成员变量赋值
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //通过set 和 get 方法给使用变量进行赋值
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

