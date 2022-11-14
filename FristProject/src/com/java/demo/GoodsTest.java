package com.java.demo;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001", "华为mate50", 6999, 1000);
        Goods g2 = new Goods("002", "保温杯", 99, 100);
        Goods g3 = new Goods("003", "枸杞子", 59, 99);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
    }
}
