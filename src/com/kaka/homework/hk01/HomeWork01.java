package com.kaka.homework.hk01;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0]= new Person("小",19,"ll");
        p[1] = new Person("超小",10,"epp");
        p[2] = new Person("中",67,"uu");
        p[3] = new Person("大",88,"uu");
        p[4] = new Person("超大",99,"uu");

        //输出当前数组
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);//默认对象的tostring方法
        }

        //使用冒泡排序
        Person temp = null;
        for (int i = 0; i < p.length - 1; i++) {//外层循环
            for (int j = 0; j < p.length - 1 - i; j++) {//内层循环
                if (p[j].getAge() < p[j+1].getAge()){
                    temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
        //排序后的值
        System.out.println("排序后的值");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
/*
定义一个Person类{name, age, job}, 初始化Person对象数组，有3个person对象，
并按照age从大到小进行排序，提示，使用冒泡排序
*/
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}