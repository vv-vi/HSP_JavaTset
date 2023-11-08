package com.kaka.poly_;

public class Master {
    String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制，可以统的管理主人喂食的问题
    //animal编译类型是Animal,可以指向(接收) AnimaL 子类的对象
    //food 编译类型是Food ,可以指向(接收) Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }

//    //完成主人对小狗喂食 骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    //方法的重载
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + name + "给" + cat.getName() + "吃" + fish.getName());
//    }
}
