package com.kaka.extend_;

public class Sub extends Base{
    public Sub(){
        super("tom",19);
        System.out.println("子类Sub()...");
    }
    public Sub(String name){
        super("kaka",30);
        System.out.println("子类Sub(String name)被调用...");
    }
    public Sub(String name,int age){
        //要调用父类的无参构造器，如下，或者什么都不写，默认就是super()
        //super();
        //要调用父类的有参构造器
        //super("hanluo");
        System.out.println("子类Sub(String name,int age)被调用...");
    }
    public void say(){
        //非私有的属性和方法可以在子类访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        System.out.println("n4=" + getN4());
        test100();
        test200();
        test300();
        //test400();错误
        callTest400();
    }
}
