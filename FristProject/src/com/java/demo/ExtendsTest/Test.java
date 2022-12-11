package com.java.demo.ExtendsTest;

public class Test {
    public static void main(String[] args) {
        Regdoll rd=new Regdoll();
        Husky h=new Husky();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        h.eat();
        h.drink();
        h.housekeep();
        h.breakHome();
    }
}
