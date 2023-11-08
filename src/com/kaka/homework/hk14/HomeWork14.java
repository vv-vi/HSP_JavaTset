package com.kaka.homework.hk14;

public class HomeWork14 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        //5.这就是输出的第一句
        System.out.println("我是A类的无参构造器");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B类的无参构造器");
    }
    public B(String name){
        //4.这里默认有有一个super()所以会先找父类的无参构造器
        //6.这就是输出的第二句
        System.out.println("我是B类的有参构造器");
    }
}
class C extends B{
    //1.找c类的无参构造器
    public C(){
        //2.找本类的有参构造器
        this("hello");
        //8.这就是输出的四句
        System.out.println("我是C类的无参构造器");
    }
    public C(String name){
        //3.找父类的有参构造器
        super("haha");
        //7.这就是输出的第三句
        System.out.println("我是C类的有参构造器");
    }
}