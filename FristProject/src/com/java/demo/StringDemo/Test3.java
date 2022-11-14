package com.java.demo.StringDemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();
        int upChatNum = 0;
        int downCharNum = 0;
        int numberNum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char cha = s1.charAt(i);
            if (cha > 'a' && cha < 'z') {
                downCharNum++;
            } else if (cha > 'A' && cha < 'Z') {
                upChatNum++;
            } else if (cha > '0' && cha < '9') {
                numberNum++;
            }
        }
        System.out.println("大写字符：" + upChatNum + "个,小写字符" + downCharNum + "个,数字" + numberNum + "个");
    }
}
