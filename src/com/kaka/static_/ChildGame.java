package com.kaka.static_;

public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量，统计有多少个小孩加入游戏
        int count = 0;
        Child child = new Child("泰勒");
        child.join();
        count++;

        Child child1 = new Child("高斯");
        child1.join();
        count++;

        Child child2 = new Child("施瓦辛格");
        child2.join();
        count++;

        System.out.println("共有" + count + "个小孩加入游戏");
    }
}

class Child{
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏。。");
    }
}
