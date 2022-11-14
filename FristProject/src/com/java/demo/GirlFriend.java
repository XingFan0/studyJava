package com.java.demo;

public class GirlFriend {
    //使用private修饰符,定义私有属性
    private int age;
    private String name;

    //定义获取和改变私有属性的方法
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("输入的年龄不符合成为女朋友");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
