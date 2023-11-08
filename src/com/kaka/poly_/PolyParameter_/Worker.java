package com.kaka.poly_.PolyParameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("员工" +getName() + "正在工作");
    }

    @Override
    public double getAnnual() {//因为其他员工没有其他收入，直接调用父类
        return super.getAnnual();
    }
}
