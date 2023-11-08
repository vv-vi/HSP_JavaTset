package com.kaka.homework.hk04;

public class Employee {
    //属性 姓名，工作天数单日工资，等级
    private String name;
    private int workDays;
    private double daySal;
    private double grade;

    public Employee(String name, int workDays, double daySal, double grade) {
        this.name = name;
        this.workDays = workDays;
        this.daySal = daySal;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //打印工资方法
    public void printSal(){
        System.out.println(name + "的工资=" + workDays * daySal * grade);
    }
}
    //    private String name;
//    private double daySal;
//    private int workDays;
//    private double grade;
//
//    //方法
//    public Employee(String name, double daySal, int workDays, double grade) {
//        this.name = name;
//        this.daySal = daySal;
//        this.workDays = workDays;
//        this.grade = grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getDaySal() {
//        return daySal;
//    }
//
//    public void setDaySal(double daySal) {
//        this.daySal = daySal;
//    }
//
//    public int getWorkDays() {
//        return workDays;
//    }
//
//    public void setWorkDays(int workDays) {
//        this.workDays = workDays;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//
//    public void setGrade(double grade) {
//        this.grade = grade;
//    }
//    //打印工资方法
//    public void printSal(){
//        System.out.println(name + "的工资=" + workDays * daySal * grade);
//    }

