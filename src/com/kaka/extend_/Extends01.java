package com.kaka.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "jack";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("==================");

        Graduate graduate = new Graduate();
        graduate.name = "tom";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
