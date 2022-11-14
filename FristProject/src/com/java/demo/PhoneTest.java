package com.java.demo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone(); //创建一个Phone类的对象。
        p.name="华为";
        p.price=6999;

        System.out.println("手机的名字"+p.name+";"+"手机的价格"+p.price);
        p.call();
        p.playGame();
    }

}
