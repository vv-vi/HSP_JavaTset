package com.kaka.codeblock_;

public class codeBlockDetail {
    public static void main(String[] args) {
        //AA aa = new AA();
        BB bb = new BB();
        //System.out.println(Cat.age);

    }
}

class Cat{
    public static int age = 10;
    static {
        System.out.println("cat的静态方法被调用");
    }
}



class AA{
    static {
        System.out.println("AA的静态代码块被执行");
    }
}

class BB extends AA{
    static {
        System.out.println("BB的静态代码块被执行");
    }
}