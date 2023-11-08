package com.kaka.pkg;

import com.kaka.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public修饰的属性或方法
        //但不能访问private，默认，protected修饰的属性或方法
        System.out.println(a.n1);
    }
}
