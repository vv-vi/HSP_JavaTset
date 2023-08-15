package Recursion;

public class Recursion01 {
    public static void main(String[] args) {
        T t = new T();
        t.tset(4);

        int f = t.factorial(5);
        System.out.println("5的阶乘：" + f);
    }
}

class T {
    public void tset(int n){
        if (n > 2){
            tset(n - 1);
        }
        System.out.println("n = " + n);
    }
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else{
            return factorial(n - 1) * n;
        }
    }
}