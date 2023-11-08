package com.kaka.homework.hk07;

public class Test {
    String name = "Rose";

    //1.最终到这里，所以第一句就输出Test
    public Test() {
        System.out.println("Test");
    }
    //2.最终到这里，发现这里是改变父类的名字，所以父类的名字就变成了Tom，
    public Test(String name) {
        this.name = name;
    }

}