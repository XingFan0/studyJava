package com.java.demo.Employee;

public class Test {
    public static void main(String[] args) {
       Menager menager= new Menager(20000);
       menager.setId("001");
       menager.setName("张三");
       menager.setSalary(10000);

       Cook cook=new Cook("002","李四",10000);

        System.out.println("名字"+menager.getName()+";工资"+menager.getSalary());
        menager.work();
    }
}
