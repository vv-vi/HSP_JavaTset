package Consstructor;

public class Constructor01 {
    public static void main(String[] args) {
        //new一个对象，直接通过构造器指定了名字和年龄
        Person p = new Person("kaka", 19);
        System.out.println(p.name + p.age);
    }
}

class Person {
    String name;
    int age;

    /**
     * 构造器
     * 1.没有返回类型
     * 2.和类名一样
     * 3.构造器的形参列表和成员方法的规则一样
     */

    public Person(String pName, int pAge) {
        System.out.println("使用了构造方法");
        name = pName;
        age = pAge;
    }

}

