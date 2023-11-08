package com.kaka.homework.hk13;

public class HomeWork13 {
    public static void main(String[] args) {
        Student stu = new Student("kaka", '男', 18, "00121213");
        stu.printInfo();
        System.out.println("===================");
        Teacher tea = new Teacher("fsdf", '女', 28, 10);
        tea.printInfo();

        Person[] people = new Person[4];
        people[0] = new Student("om", '女', 10, "0001");
        people[1] = new Student("fd", '男', 20, "0002");
        people[2] = new Teacher("rt", '女', 28, 5);
        people[3] = new Teacher("bf", '男', 40, 20);

        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(people);

        System.out.println("======排序后的数组情况=======");
        for (int i = 0; i < people.length ; i++){
            System.out.println(people[i]);
        }

        //遍历数组，调用test方法
        System.out.println("===============");
        for (int i = 0; i < people.length; i++){
            homeWork13.test(people[i]);
        }
    }

    /**
     * 定义方法，形参为Person类型，功能：调用学生的study和老师的teach方法，
     * 分析这里会使用到向下转型，写法：（子类）父类的引用
     * @param person
     */
    public void test(Person person){
        if (person instanceof Student){
            ((Student) person).study();
        }else if (person instanceof Teacher){
            ((Teacher) person).teach();
        }else{
            System.out.println("do nothing");
        }
    }
    //排序方法，从高到底排序
    public void bubbleSort(Person[] persons){
        Person temp = null;

        for (int i = 0; i <  persons.length - 1; i++){
            for (int j = 0; j < persons.length- 1 - i; j++){
                //判断年龄的大小，所以要getAge
                if (persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
