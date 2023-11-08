package com.kaka.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("汤姆");

        Dog dog = new Dog("旺财");
        Bone bone = new Bone("大棒骨");
        master.feed(dog,bone);
        System.out.println("=======================");
        Cat cat = new Cat("团团");
        Fish fish = new Fish("黄花鱼");
        master.feed(cat,fish);
        System.out.println("=======================");
        Pig pig = new Pig("佩奇");
        Rice rice = new Rice("五常大米");
        master.feed(pig,rice);
    }
}
