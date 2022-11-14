package com.java.demo.StringDemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String s1="abc";
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s2=sc.next();
        boolean flag=s1.equals(s2);
        System.out.println(s1==s2);
    }
}
