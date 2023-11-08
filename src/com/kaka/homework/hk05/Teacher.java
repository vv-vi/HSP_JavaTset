package com.kaka.homework.hk05;

public class Teacher extends Employee{
    private int classDay;//一年上课天数
    private double classSal;//课时费

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    //方法
    @Override
    public void printSal() {
        System.out.println("老师" + getName() + "的年工资是：" + (getSalMonth() * getSal() + classDay * classSal));
    }
}
