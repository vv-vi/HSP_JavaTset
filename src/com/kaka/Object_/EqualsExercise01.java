package com.kaka.Object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack",20,'男');
        Person person2 = new Person("jack",20,'男');
        //这里因为是创建了两个对象Person1和person2，所以结果为false
        System.out.println(person1.equals(person2));
    }

}

class Person{
    private String name;
    private int age;
    private char gender;

   //重写equals方法，让对象的所有属性都相等就返回为真
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        //类型判断，因为我们要取值，所以要进行向下转型首先进行判断
        if (obj instanceof Person){
            //向下转型，取得各属性的值
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //如果不是person，就直接返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
