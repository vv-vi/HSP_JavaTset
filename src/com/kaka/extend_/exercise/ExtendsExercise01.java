package com.kaka.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {

        C c = new C();
    }
}

class A {//A类

    public A() {
        System.out.println("我是A类");
    }
}

class B extends A { //B类,继承A类
    //mai
    public B() {
        System.out.println("我是B类的无参构造");
    }

    public B(String name) {
       //默认super()
        System.out.println(name + "我是B类的有参构造");
    }
}

class C extends B { //C类， 继承B类
    public C() {
        this("hello");
        System.out.println("我是c类的无参构造");
    }

    public C(String name) {
        super("hahah");
        System.out.println("我是c类的有参构造");
    }
}


