package com.java.demo;

public class Test4 {
    /*目标：定义方法根据存入的索引下标截取数组并返回*/
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
       int[] res= sliceArr(arr,2,6);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
    public static int [] sliceArr(int [] arr,int from ,int to){
        int [] newArr=new int[to-from]; //动态定义数组
        int index=0;
        for (int i = from; i < to; i++) {
            newArr[index]=arr[i];
            index+=1;
        }
        return newArr;
    }
}
