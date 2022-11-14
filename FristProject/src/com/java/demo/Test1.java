package com.java.demo;

public class Test1 {
    /*目标：学习方法的重载*/
    public static void main(String[] args) {
        byte b1=10;
        byte b2=20;
       boolean res1= compare(b1,b2);
        System.out.println("b1大于b2的结果为"+(res1?"真":"假"));
        int i1=10;
        int i2=20;
        boolean res2= compare(i1,i2);
        System.out.println("i1大于i2的结果为"+(res2?"真":"假"));
    };
    public static boolean compare(byte b1,byte b2){
        System.out.println("byte比较重载被调用");
        return b1>b2;
    };
    public static boolean compare(double d1,double d2){
        System.out.println("double比较重载被调用");
        return d1>d2;
    };
    public static boolean compare(int i1,int i2){
        System.out.println("int比较重载被调用");
        return i1>i2;
    };
    public static boolean compare(long l1,long l2){
        System.out.println("long比较重载被调用");
        return l1>l2;
    };
}
