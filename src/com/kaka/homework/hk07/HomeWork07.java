package com.kaka.homework.hk07;

public class HomeWork07 {
    public static void main(String[] args) {

        /**
         * 1.new一个新对象的时候，会找Demo无参构造器，
         */
        new Demo().test();
        /**
         * 2.new 一个新对象，会找Demo有参构造器
         */
        new Demo("tom").test();
    }
}
