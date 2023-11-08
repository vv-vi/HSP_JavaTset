package com.kaka.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型，父类的引用指向子类对象
        //语法： 父类对象引用名 = new 子类类型（）；
        Animal animal = new Cat();
        //Animal animal1 = new Dog();
        animal.eat();
        animal.run();
        animal.sleep();
        animal.show();

        //老师希望，可以调用Cat的catchMouse方法
        //多态的向下转型
        //语法:子类类型 引用名= (子类类型) 父类引用;

        //编译类型是cat，运行类型也是cat
        Cat cat = (Cat) animal;
        //这里的animal所指的对象就是Cat，如果这里强制转化为Dog类的话，就会报错。
        // 想要不报错的话，就需要重新生成一个对象，
        //Dog dog = (Dog) animal;
        cat.catchMouse();

    }
}
