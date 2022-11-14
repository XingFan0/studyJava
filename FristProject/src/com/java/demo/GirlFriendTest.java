package com.java.demo;

import java.util.Scanner;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1=new GirlFriend();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入女朋友的年龄：");
        int age=sc.nextInt();
        gf1.setAge(age);
        System.out.println("年龄："+gf1.getAge());

        gf1.setName("婷婷");
        System.out.println("名字："+gf1.getName());
    }
}
