package com.kaka.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        PC pc = new PC("英特尔",16,512,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("AMD", 32, 512, "白色");
        notePad.printInfo();
    }
}
/*
编写Computer类，包含CPU、 时存、硬盘等属性，getDetails方法用 于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性(品牌brand]
编写NotePad子类，继承Computer类，添加特有属性[ coLor]
编写Test类，在main方 法中创建PC和NotePad对象，分别给对象中特有的属性赋值，
以及从Computer类继承的属性赋值，并使用方法并打印输出信息
*/

