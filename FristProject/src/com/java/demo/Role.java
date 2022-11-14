package com.java.demo;

import java.util.Random;

public class Role {
    private String name;
    private int bound;
    private char gender;
    private String face;

    String[] boyFaces = {"风流倜傥", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};

    public Role() {

    }

    public Role(String name, int bound, char gender) {
        this.name = name;
        this.bound = bound;
        this.gender = gender;
        this.setFace(gender);//调用属性的set方法，在构造方法中初始化属性值；
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random random = new Random();
        if (gender == '男') {
            int index = random.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            int index = random.nextInt(boyFaces.length);
            this.face = girlFaces[index];
        }
    }
    public void showRoleInfo(){
        System.out.println("姓名："+getName());
        System.out.println("性别："+getGender());
        System.out.println("长相："+getFace());
    }
    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        int leaveBound = role.getBound() - hurt;
        role.setBound(leaveBound);
        System.out.println(this.getName() + "攻击了" + role.getName() + "，打掉了" + hurt + "血剩余血量为" + leaveBound);
    }

}
