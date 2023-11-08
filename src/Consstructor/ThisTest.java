package Consstructor;

public class ThisTest {
    public static void main(String[] args) {
        Personn p1 = new Personn("Tom",10);
        Personn p2 = new Personn("kaka ",10);
        System.out.println(p1.comparTo(p2));
    }
}

/*
定义Person类，里面有name、age属性，并提供compareTo比较方法，
用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
名字和年龄完全一样，就返回true, 否则返回false
*/

class Personn{
    String name;
    int age;

    public Personn(String name,int age){
         this.name = name;
         this.age = age;
    }
    public boolean comparTo(Personn p){
        //比较方法
        return this.name.equals(p.name) && this.age == (p.age);
    }
}