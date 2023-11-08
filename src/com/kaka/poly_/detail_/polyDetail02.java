package com.kaka.poly_.detail_;

public class polyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        //属性没有重写这一说法，运行结果看编译类型Base
        System.out.println(base.count);//10
    }
}

class Base{//父类
    int count = 10;//属性
}
class Sub extends Base {//子类
    int count = 20;//属性
}