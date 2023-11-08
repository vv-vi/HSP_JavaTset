package com.kaka.homework.hk04;

public class Worker extends Employee {

    public Worker(String name, int workDays, double daySal, double grade) {
        super(name, workDays, daySal, grade);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工");
        super.printSal();
    }
}
//    public Worker(String name, double daySal, int workDays, double grade) {
//        super(name, daySal, workDays, grade);
//    }
//
//    @Override
//    public void printSal() {
//        System.out.print("普通员工");
//        super.printSal();
//    }

