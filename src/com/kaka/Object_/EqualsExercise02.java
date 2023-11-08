package com.kaka.Object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Personn p1 = new Personn();
        p1.name = "hspedu";
        Personn p2 = new Personn();
        p2.name = "hspedu";

        System. out.println(p1 == p2); //False，因为是引用类型，所以比较的是对象
        System. out.println(p1.name.equals(p2.name));//T，比较的是内容，
        System. out.println(p1.equals(p2));//False比较的是对象，没有重写eq方法


        String s1 = new String(" asdf");
        String s2 = new String(" asdf");

        System. out.println(s1.equals(s2));//T，字符串被重写，判断的是内容
        System. out.println(s1==s2); //F，不是同一个对象

    }

}

class Personn{
    public String name;
}
