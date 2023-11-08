package com.kaka.houserent.utils;

public class TestUtility {
    //测试类，使用完就可以删除
    public static void main(String[] args) {
        //要求输入一个字符串，要求长度最大为三
        String s = Utility.readString(3);
        System.out.println("string:" + s);
    }
}
