package com.kaka.Object_;

public class HashCode_ {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        System.out.println("aa1=" + aa1.hashCode());
        System.out.println("aa2=" + aa2.hashCode());
        System.out.println("aa3=" + aa3.hashCode());
    }
}

class AA{

}