package com.kaka.homework.hk04;

/**
 * 父类:员工类
 * 子类:部门经理类、普通员工类
 * (1)部门经理工资= 1000+单日工资*天数*等级(1.2) 。=>奖金+基本工资
 * (2)普通员工工资=单日工资*天数*等级(1.0) ;
 * (3)员工属性:姓名，单日工资，工作天数
 * (4)员工方法(打印工资)
 * (5)普遍员工及部广经理都是员工子类，需要重写打印工资方法。
 * (5)定义并初始化普通员工对象，调用打印工资方法输出工资，定义并初始化部门]经理对象，
 * 调用打印工资方法输出工资
 */
public class HomeWork04 {
    public static void main(String[] args) {

        Manager manager = new Manager("大大", 20, 200, 1.2);
        manager.setBonus(2000);
        manager.printSal();

        Worker worker = new Worker("山东高速", 28, 150, 1.0);
        worker.printSal();
//        Manager manager = new Manager("丈夫", 100, 20, 1.2);
//        //设置奖金
//        manager.setBonus(3000);
//        manager.printSal();
//        Worker worker = new Worker("阿珂", 200, 30, 1.0);
//        worker.printSal();
    }
}
