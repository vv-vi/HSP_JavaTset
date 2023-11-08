package com.kaka.homework.hk10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("fa", 22, "faf", 'a', 14124);
        Doctor doctor1 = new Doctor("fa", 22, "faf", 'a', 14124);
        System.out.println(doctor.equals(doctor1));
    }
}
