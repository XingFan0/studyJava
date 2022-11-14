package com.java.demo;

public class Test2 {
    /*需求：设计一个方法用于数组的遍历，要求遍历的结果是在一行上的，例如：[11,22,33,44,55]*/
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
          if (i<(arr.length-1)) str+=arr[i]+",";
          else str+=arr[i];
        }
        str+=']';
        System.out.println(str);
    }
}
