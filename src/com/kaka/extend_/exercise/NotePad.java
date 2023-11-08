package com.kaka.extend_.exercise;

public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println("PC信息=");
        //调用父类的方法，得到PC的信息
        System.out.println(getDetails() + " color=" + color);
    }
}
