package com.java.demo;

public class User {
    private String userName;
    private String passWord;
    private String email;
    private String gender;
    private int age;

    public User() {

    }

    public User(String userName, String passWord, String email, String gender, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void register() {
        System.out.println("注册");
    }
}
