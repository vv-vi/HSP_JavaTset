package com.kaka.Object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        "ada".equals("adad");
    }
}

class A{}
