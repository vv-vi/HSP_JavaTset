package OverLoad;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(3);
        methods.m(2,3);
        methods.m("我是字符串");


        System.out.println(methods.max(2, 3));
        System.out.println(methods.max(5.3,3.4));
        System.out.println(methods.max(5.3,3.4,7.8));

    }
}

class Methods{

    /**
     * 分析
     * 方法名 max
     * 形参 （int int）
     * void
     */
    public int max(int n1,int n2){
        //如果n1大于n2就返回n1,否则返回n2
        return n1 > n2 ? n1 : n2;
    }

    /**
     * 分析
     * 方法名 max
     * 形参 （double double）
     * void
     */
    public double max(double n1,double n2){
        //如果n1大于n2就返回n1,否则返回n2
        return n1 > n2 ? n1 : n2;
    }

    /**
     * 分析
     * 方法名 max
     * 形参 （double double double）
     * void
     */
    public double max(double n1,double n2,double n3){
        //先求出n1 和 n2的最大值
        double max1 =  n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }

    /**
     * 分析
     * 方法名 n
     * 形参 （int）
     * void
     */
    public void m(int n){
        System.out.println("平方=" + (n * n));
    };


    /**
     * 分析
     * 方法名 n
     * 形参 （int int）
     * void
     */
    public void m(int n,int m){
        System.out.println("相乘=" + (n * m));
    };
    /**
     * 分析
     * 方法名 n
     * 形参 （string）
     * void
     */
    public void m(String n){
        System.out.println("字符串=" + n);
    };

}
