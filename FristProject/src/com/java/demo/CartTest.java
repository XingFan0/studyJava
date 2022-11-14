package com.java.demo;

import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        Car[] carArr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            System.out.println("输入汽车的品牌:");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("输入汽车的价格:");
            int price = sc.nextInt();
            car.setPrice(price);
            System.out.println("输入汽车的颜色:");
            String color = sc.next();
            car.setColor(color);
            carArr[i] = car;
        }

        for (int i = 0; i < carArr.length; i++) {
            Car car = new Car();
            car = carArr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}
