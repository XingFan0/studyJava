package com.java.demo;

public class TestJavaBean {
    private String userName;
    private String passWord;
    private String email;
    private String gender;
    private int age;

    //通过快捷键alt+insert 快速生成JavaBean
    public TestJavaBean() {

    }

    public TestJavaBean(String userName, String passWord, String email, String gender, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
