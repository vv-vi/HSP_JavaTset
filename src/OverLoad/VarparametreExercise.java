package OverLoad;

public class VarparametreExercise {
    public static void main(String[] args) {
        /**
         * 有三个方法，
         * 分别实现
         * 返回姓名和两门课成绩(总分)，
         * 返回姓名和三门课成绩(总分)，
         * 返回姓名和五门课成绩(总分)。
         * 封装成一个可变参数的方法
         */
        Methodss ms = new Methodss();
        System.out.println(ms.showScore("张三",90.1,89.0));
        System.out.println(ms.showScore("李四",90.1,89.0,89.1));
        System.out.println(ms.showScore("王五",90.1,89.0,8.9,99.0,88.2));
    }
}

class Methodss{
    //分析1，形参（string double...）,返回string
    public String showScore(String name,double... scores){
        double totalScor = 0;
        for (int i = 0;i< scores.length;i++){
            totalScor += scores[i];
        }
        return name + "有" + scores.length + "门课的总分为" + totalScor ;
    }
}