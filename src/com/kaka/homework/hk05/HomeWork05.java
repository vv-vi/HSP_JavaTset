package com.kaka.homework.hk05;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("af", 10000);
        //灵活的修改带薪的月份
        worker.setSalMonth(13);
        worker.printSal();

        Peasant peasant = new Peasant("sdg", 10000);
        peasant.printSal();

        Teacher teacher = new Teacher("hd", 2000);
        teacher.setClassDay(300);
        teacher.setClassSal(500);
        teacher.printSal();

        Scientist scientist = new Scientist("gd", 20000);
        scientist.setBonus(200000);
        scientist.printSal();
    }
}
