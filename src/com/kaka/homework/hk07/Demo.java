package com.kaka.homework.hk07;

public class Demo extends Test{
    String name = "jack";


    Demo(){
        //1.找父类Test的无参构造器，
        super();
        //1.第二句就输出Demo
        System.out.println("Demo");
    }

    Demo(String s){
        //2.找到有参构造器，发现是super，再找父类Test的有参构造器
        super(s);
    }

    //1.会进入到test方法，
    public void test(){
        //1.输出父类的名字和本类的名字
        //2.输出父类的名字和本类的名字
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
