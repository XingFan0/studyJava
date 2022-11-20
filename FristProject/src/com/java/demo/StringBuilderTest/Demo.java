package com.java.demo.StringBuilderTest;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("aaa");

        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        sb.reverse();
        sb.toString();


        System.out.println(sb);
    }
}
