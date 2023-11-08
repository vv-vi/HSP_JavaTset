package Consstructor;

/**
 * 构造器的重载
 */
public class ConstructorDetail {
    public static void main(String[] args) {
        Cat cat = new Cat("蓝阿莫", 10);
        Cat cat1 = new Cat("汤姆");
        System.out.println(cat.name + cat.age);
        System.out.println(cat1.name);
    }
}

class Cat{
    String name;
    int age;
    //第一个构造器
    public Cat(String cName,int cAge){
        name = cName;
        age = cAge;
    }
    //第二个构造器
    public Cat(String cName){
        name = cName;
    }
}