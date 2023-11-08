package com.kaka.poly_.PolyArray_;

public class PolyArr {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下:要求创建1个Person对象、
        // 2个Student对象和2个Teacher对象， 统一 放在数组中，并调用每个对象say方法●
        Person[] person = new Person[5];
        person[0] = new Person("kaka",18);
        person[1] = new Student("tomm",20,100);
        person[2] = new Student("jack",19,90);
        person[3] = new Teacher("luoji",34,5000);
        person[4] = new Teacher("luoba",45,9000);

        for (int i = 0; i < person.length; i++) {
            //person[i]的编译类型是Person类，运行类型根据实际情况有JVM来判断
            System.out.println(person[i].say());
            //判断person[i]的运行类型是不是Student
            if (person[i] instanceof Student){
                //向下转型，父类转为子类,因为由于动态绑定机制的原因，子类的特有方法是跟该对象绑定的，直接调是不行的
                Student student = (Student) person[i];
                student.study();
            }else if (person[i] instanceof Teacher){
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            }else if (person[i] instanceof Person){
                //System.out.println("你的类型有误，请检查");
            }
        }
    }
}
