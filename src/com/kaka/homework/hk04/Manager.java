package com.kaka.homework.hk04;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int workDays, double daySal, double grade) {
        super(name, workDays, daySal, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("经理" + getName() + "的工资=" + (getWorkDays() * getDaySal() *getGrade() +bonus));
    }
}

//    //特有属性 奖金
//    private double bonus;
//    //创建manager对象时奖金并不确定
//    //可以通过setbonus赋值
//    public Manager(String name, double daySal, int workDays, double grade) {
//        super(name, daySal, workDays, grade);
//    }
//
//    public double getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(double bonus) {
//        this.bonus = bonus;
//    }
//
//    //方法 重写父类的printsal方法
//
//    @Override
//    public void printSal() {
//        //因为经理的工资计算方式，和员工不一样，所以我们可以重写
//        System.out.println("经理" + getName() + "的工资=" + (bonus + getDaySal() * getGrade() * getWorkDays()));
//    }
