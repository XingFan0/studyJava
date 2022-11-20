package com.java.demo.StaticTest;

public class Student {
    private String name;
    private int age;
    private char gender;//静态属性需要使用set和get设置和调用

    public static  String teacherName;

    public Student() {

    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println("正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }
}
