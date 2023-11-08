package Consstructor;

public class HomeWork12 {

}
/**
 * 12.创建一个Employee类, 属性有(名字， 性别，年龄，职位，薪水)，提供3个构造
 * 方法，可以初始化(1) (名字，性别，年龄，职位，薪水), (2) (名字，性别，年龄) (3)
 * (职位，薪水),要求充分复用构造器
 */
class Employee{
    //名字， 性别，年龄，职位，薪水
    String name;
    char gender;
    int age;
    String job;
    double sal;
    //因为要复用构造器，所以要从属性少的开始写，这要才能复用
    //职位，薪水
    public Employee(String job,double sal){
        this.job = job;
        this.sal = sal;
    }
    //名字，性别，年龄
    public Employee( String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //名字， 性别，年龄，职位，薪水
    public Employee( String name,char gender,int age,String job,double sal){
        //这里调用前面的构造器，要放在第一行，所以不能再使用this(job,sal)
        this(name,gender,age);
        this.job = job;
        this.sal = sal;

    }
}
