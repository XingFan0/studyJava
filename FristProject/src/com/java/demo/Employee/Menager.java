package com.java.demo.Employee;

public class Menager extends Employee {
    private double bouns;

    public Menager(double bouns) {
        this.bouns = bouns;
    }

    public Menager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}