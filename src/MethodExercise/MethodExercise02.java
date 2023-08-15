package MethodExercise;

public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milan";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        System.out.println("p的年龄" + p.age +  "\tp的名字" + p.name);
        System.out.println("p2的年龄" + p2.age + "\tp2的名字" + p2.name);
        System.out.println(p == p2);


    }
}

class Person{
    String name;
    int age;
}

class MyTools{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age= p.age;
        return p2;
        }

}
