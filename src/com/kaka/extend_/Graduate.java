package com.kaka.extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    //考试
    public void testing(){
        System.out.println("大学生" + name + "正在考大学数学");
    }
    public void showInfo(){
        System.out.println("学生：" + name + " 年龄：" + age + " 分数：" + score);
    }
}
