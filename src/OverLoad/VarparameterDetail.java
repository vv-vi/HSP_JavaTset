package OverLoad;

public class VarparameterDetail {
    public static void main(String[] args) {
/**
 * 2，可变参数的形参可以是数组
 */
    int[] arr = {12,3,4};
        T t = new T();
        t.f1(arr);
    }
}

class T {

    public void f1(int... nums){
        System.out.println("长度=" + nums.length);
    }

    public void f1(String str,int... nums){
        System.out.println("长度=" + nums.length);
    }

}