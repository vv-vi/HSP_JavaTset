package com.kaka.Object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("piet","吃饭",1000);
        System.out.println(monster.toString() + "\thashcode=" + monster.hashCode());
    }

}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写tostrng方法就是获取对象的属性，一般重写之后就是把对象的属性输出。
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}