package com.kaka.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("小王");
        p.setAge(28);
        p.setSalary(30000.0);
        p.setRale(1);
        System.out.println(p.info());
    }
}

/**
 * 请大家看一个小程序(com.hspedu.encap: Encapsulation01.java),不能
 * 随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理
 * 就设置，否则给默认
 * 年龄，必须在1-120,年龄，工资不能直接查看，name的长度在 2- 6字符
 * 之间
 */
class Person {
    public String name;//名字
    private int age;//年龄
    private double salary;//工资

    public int getRale() {
        return rale;
    }

    public void setRale(int rale) {
        this.rale = rale;
    }

    public int rale ;//权限

    //公共的set方法
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6 ) {
            this.name = name;
        }else {
            System.out.println("你的名字长度有误，设置为默认值");
            this.name = "无名";
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄有误，给一个默认年龄18");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //公共的get方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        if (rale == 1) {
            return salary;
        }else {
            System.out.println("你的权限不够，不能查看工资");
            return 0.0;
        }
    }

    public String info() {
        return "名字=" + getName() + " 年龄=" + getAge() + " 工资=" + getSalary();
    }
}