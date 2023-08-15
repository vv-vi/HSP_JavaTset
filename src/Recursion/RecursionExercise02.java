package Recursion;

public class RecursionExercise02 {
    public static void main(String[] args) {
        TestA a = new TestA();
        int day = 10;
        int i = a.Peach(day);
        System.out.println("第" +day + "天的桃子数：" + i);
    }
}

class TestA{
    /**
     * 猴子吃桃规律（逆推思想）
     * 1.day10的桃子 = 1
     * 2.day9的桃子 = （day10的桃子 + 1）* 2 = 4
     * 3.day8的桃子 = （day9的桃子 + 1）* 2 = 10
     */
    public int Peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (Peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}