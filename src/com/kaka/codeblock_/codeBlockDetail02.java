package com.kaka.codeblock_;

public class codeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
    //普通属性初始化
    private int N2 = N();
    private int N(){
        System.out.println("a的普通方法");//3
        return 10;
    }

    {
        System.out.println("普通代码块");//4
    }
    static {
        System.out.println("静态代码块");//1
    }
    //静态属性初始化
    private static int n1 = N1();
    public static int N1(){
        System.out.println("a的静态方法n1");//2
        return 10;
    }

    public A() {
        System.out.println("构造器被调用");
    }
}