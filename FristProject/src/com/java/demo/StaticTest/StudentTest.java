package com.java.demo.StaticTest;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="李老师";
        Student s1 = new Student("张三", 18, '男');
        //s1.teacherName="王老师";
        s1.study();
        s1.show();
        Student s2 = new Student("李四", 19, '男');
        s2.study();
        s2.show();
    }
}
