package com.kaka.main_;

public class Main01 {

    public static String name = "kaka";

    public int n1 = 10000;

    public static void hi(){

    }

    public  void cry(){
        System.out.println("main01的cry方法");
    }
    public static void main(String[] args) {
        //可以直接调用静态属性，name
        System.out.println("name=" + name);
        //n1非静态的属性，所以直接调用是不行的
        //System.out.println("n1=" + n1);
        //也可以直接调用静态方法hi（）
        hi();
        //由于cry方法不是静态的，所以不能直接调用，只能通过实例化对象来调用
        //cry();
        Main01 main01 = new Main01();
        main01.cry();
    }
}
