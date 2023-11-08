package com.kaka.override_;

/**
 *在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        System.out.println(person.say());

        Student tom = new Student("tom", 17, 1, 90.0);
        System.out.println(tom.say());
    }
}
