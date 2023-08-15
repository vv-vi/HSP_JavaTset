package MethodParameter;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        BB bb = new BB();
        bb.swap(a, b);
        System.out.println("mian方法的a:" + a + "main方法的b:" + b);
    }
}
    class BB{
        public void swap(int a,int b){
            System.out.println("交换前的a:" + a + "交换前的b:" + b);
            int stmp = a;
            a = b;
            b = stmp;
            System.out.println("交换后的a:" + a + "交换后的b:" + b);
        }
    }
