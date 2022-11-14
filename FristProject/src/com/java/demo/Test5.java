package com.java.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票单价");
        int price = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("输入仓位类型");
        int seat = sc.nextInt();
        planPrice(price, month, seat);
    }

    public static void planPrice(int price, int month, int seat) {
        if (month < 1 || month > 12) {
            System.out.println("输入的月份无效");
            return;
        }
        int realPrice = price;
        if (5 <= month && month <= 12) {
            realPrice = seat == 0 ?(int) (price * 0.9) :(int)( price * 0.7);
        } else {
            realPrice = seat == 0 ? (int) (price * 0.85) : (int) (price * 0.65);
        }
        System.out.println("机票的真是价格为" + realPrice);
    }
}
