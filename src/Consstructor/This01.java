package Consstructor;

public class This01 {
    public static void main(String[] args) {
        /**
         * 这里调用了Dog对象，那么构造函数里面的this就是指dog
         */
        Dog dog = new Dog("旺财", 10);
        dog.info();
    }
}

class Dog{
    String name;
    int age;
    public Dog(String name,int age){
        /**
         * Dog被调用，this就是代指dog
         */
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("name=" + name + "\tage=" + age);
    }
}
