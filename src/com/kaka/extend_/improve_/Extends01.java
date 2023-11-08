package com.kaka.extend_.improve_;

import com.kaka.extend_.Graduate;
import com.kaka.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "loke";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(89);
        pupil.showInfo();

        System.out.println("==================");

        Graduate graduate = new Graduate();
        graduate.name = "kaka";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(78);
        graduate.showInfo();
    }
}
