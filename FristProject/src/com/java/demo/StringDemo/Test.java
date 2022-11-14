package com.java.demo.StringDemo;

public class Test {
    public static void main(String[] args) {
        //实现：创建String对象的方式
        //方式1：直接赋值
        String s1="abcd";

        //方式2：空参构造：可以获取一个空白的字符串对象
        String s2=new String();

        //方式3：传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3=new String("abcd");

        //方式4：传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char [] chs={'a','b','c','d'};
        String s4=new String(chs); //s4输出为abcd

        //方式5：传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后咋网络当中传递的数据其实就是字节信息。
        byte [] bytes={97,98,99,100};
        String s5=new String(bytes); //输出abcd
    }
}
