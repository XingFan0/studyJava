package com.java.demo;

public class StudentTest {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setAge(18);
        student1.setName("包子");
        System.out.println("学生1的名字:"+student1.getName()+"；年龄:"+student1.getAge());

        Student student2=new Student(19,"朱朱");
        System.out.println("学生2的名字:"+student2.getName()+"；年龄:"+student2.getAge());
    }
}
