package com.kaka.homework.hk05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家" + getName() + "的年工资是" + (getSalMonth() * getSal() + bonus));
    }
}
