package com.kaka.poly_.PolyParameter_;

public class Manage extends Employee{
    private double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manag(){
        System.out.println("经理" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
