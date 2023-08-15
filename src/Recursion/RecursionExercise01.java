package Recursion;

public class RecursionExercise01 {
    public static void main(String[] args) {
        Test test = new Test();
        int n = 45;
        int i = test.fibonacci(n);
        if (i >= 1) {
            System.out.println("第" + n + "位斐波拉契：" + i);
        }
    }
}

class Test{
    //斐波拉契数1，1，2，3，5，8，13
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else {
            System.out.println("必须输入大于等于1的数");
            return -1;
        }

    }
}
