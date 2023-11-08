package com.kaka.override_;

public class Override01 {
    public static void main(String[] args) {
        //演示方法重写
        /**
         * 这是dog的cry方法和animal的cry方法定义形式一样（方法名，返回类型，形参）
         * 这时我们就是说dog的cry方法重写了animal的cry方法
         */
        Dog dog = new Dog();
        dog.cry();
    }
}
