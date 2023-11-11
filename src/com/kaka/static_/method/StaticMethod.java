package com.kaka.static_.method;

public class StaticMethod {
    public static void main(String[] args) {
        Stu otm = new Stu("otm");
        otm.payFree(100);

        Stu af = new Stu("af");
        af.payFree(100);

        Stu.showFree();
    }
}

class Stu{
    private String name;
    private static double pay;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFree(double pay){
        Stu.pay += pay;
    }
    public static void showFree(){
        System.out.println("学费为：" + pay);
    }
}
