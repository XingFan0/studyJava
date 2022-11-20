package com.java.demo.ArrayListTest;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);

        ArrayList<Phone> phone = getPhone(phones, 3000);
        if (phone.size() != 0) {
            for (int i = 0; i < phone.size(); i++) {
                System.out.println("品牌：" + phone.get(i).getBrand() + " 价格：" + phone.get(i).getPrice());
            }
        }
    }

    public static ArrayList<Phone> getPhone(ArrayList<Phone> phones, int price) {
        ArrayList<Phone> newPhone = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() < price) {
                newPhone.add(phones.get(i));
            }
        }
        return newPhone;
    }
}
