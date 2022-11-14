package com.java.demo;

public class Test3 {
    /*需求：判断数字在数组中是否存在*/
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int num=10;
       boolean res= contains(arr,num);
        System.out.println("判断num是否存在arr中的结果为"+res);
    }
    //定义判断方法
    public static boolean contains(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[1]) return true;
        }
        return false;
    }
}
