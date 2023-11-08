package OverLoad;

public class overLoad01 {
    public static void main(String[] args) {
        /**
         * 方法的重载 同一个方法名，不同的形参列表
         */

        MyCalculator mc = new MyCalculator();
        int calcylator = mc.calcylator(1, 2);
        double calcylator1 = mc.calcylator(1.1, 2);
        double calcylator2 = mc.calcylator(1, 2.1);
        int calcylator3 = mc.calcylator(1, 2, 3);
        System.out.println(calcylator);
        System.out.println(calcylator1);
        System.out.println(calcylator2);
        System.out.println(calcylator3);
    }
}

     class MyCalculator{
        public int calcylator(int n1,int n2){
            return n1 + n2;
        }
        public double calcylator(double n1,int n2){
            return n1 + n2;
        }
        public double calcylator(int n1,double n2){
            return n1 + n2;
        }
        public int calcylator(int n1,int n2,int n3){
            return n1 + n2 + n3;
        }
    }

