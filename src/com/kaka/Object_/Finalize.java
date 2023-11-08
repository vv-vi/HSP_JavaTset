package com.kaka.Object_;

//演示finalize的使用
public class Finalize {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null;
        System.gc();
        System.out.println("程序退出了");

    }
}

class Car{
  private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁了汽车" + name);
        System.out.println("释放了资源");
    }
}