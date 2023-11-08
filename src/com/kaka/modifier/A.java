package com.kaka.modifier;

public class A {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1(){
        //在同一个类中，四个访问修饰符所修饰的属性或方法，都可以被访问
        System.out.println("n1=" + n1 + " n2=" + n2 + " n3=" + n3 + " n4=" + n4);
    }
}
