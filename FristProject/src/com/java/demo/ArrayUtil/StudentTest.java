package com.java.demo.ArrayUtil;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("张三",18,'男');
        Student s2=new Student("李四",19,'男');
        Student s3=new Student("王五",20,'男');
        ArrayList <Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        int maxAge=StudentUtil.getMaxAge(students);
        System.out.println("最大年龄为"+maxAge);
    }
}
