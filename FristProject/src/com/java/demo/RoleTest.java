package com.java.demo;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("鸠摩智", 100, '男');
        r1.showRoleInfo();
        r2.showRoleInfo();
        while (true) {
            r1.attack(r2);
            if (r2.getBound() <= 0) {
                System.out.println("鸠摩智死掉了");
                break;
            }
            r2.attack(r1);
            if (r1.getBound() <= 0) {
                System.out.println("乔峰死掉了");
                break;
            }
        }
    }
}
