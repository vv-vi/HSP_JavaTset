package com.kaka.codeblock_;

public class codeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{

    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        //1.super()。。这里没有父类所以就直接找代码块
        //2.调用普通的代码块
        System.out.println("AAA的构造器被调用");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块被调用");
    }

    public BBB(){
        //1.super()
        //2.调用普通的代码块
        System.out.println("BBB的构造器被调用");
    }
}