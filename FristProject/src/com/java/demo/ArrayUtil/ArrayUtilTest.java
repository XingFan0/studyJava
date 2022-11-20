package com.java.demo.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        String arrStr=ArrayUtil.printArr(arr);
        System.out.println(arrStr);

        double arrAverage=ArrayUtil.getAverage(arr);
        System.out.println(arrAverage);
    }
}
