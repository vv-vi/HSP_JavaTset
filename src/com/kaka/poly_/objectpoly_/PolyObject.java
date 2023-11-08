package com.kaka.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验多态
        //animal就是编译类型，Dog就是运行类型
        Animal animal  = new Dog();
        //因为运行时，执行到改行时，Animal运行类型就是Dog，所以cry就是Dog的cry
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
