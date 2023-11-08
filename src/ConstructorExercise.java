public class ConstructorExercise {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("tom",79);
        System.out.println("name=" + p1.name + "\tage=" + p1.age);
        System.out.println("name=" + p2.name + "\tage=" + p2.age);

    }
}
/**
 在前面定义的Person类中添加两个构造器:
 第一个无参构造器:利用构造器设置所有人的age属性初始值都为18
 第二个带pName和pAge两个参数的构造器:
 使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 分别使用不同的构造器，创建对象。
 **/
class Person{
    String name;
    int age;
    //无参构造器
    public Person(){
        age = 18;
    }
    //第二个带pName和pAge两个参数的构造器:
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
