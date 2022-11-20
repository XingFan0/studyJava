package com.java.demo.ArrayUtil;

public class Student {
    private String name;
    private int age;
    private  char genner;


    public Student() {
    }

    public Student(String name, int age, char genner) {
        this.name = name;
        this.age = age;
        this.genner = genner;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return genner
     */
    public char getGenner() {
        return genner;
    }

    /**
     * 设置
     * @param genner
     */
    public void setGenner(char genner) {
        this.genner = genner;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", genner = " + genner + "}";
    }
}
