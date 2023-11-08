package com.kaka.poly_.PolyArray_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    //重写父类say方法
    public String say() {
        return super.say() + "\tscore=" + score;
    }
    //学生特有方法
    public void study(){
        System.out.println("学生" + getName() + "正在学java");
    }
}
