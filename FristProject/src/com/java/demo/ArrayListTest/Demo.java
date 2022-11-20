package com.java.demo.ArrayListTest;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");

        String rm1=arrayList.remove(0);
        System.out.println("删除元素"+rm1);

        arrayList.set(0,"fff");

        String get2=arrayList.get(2);

        System.out.println("获取元素"+get2);
        System.out.println(arrayList);
    }
}
