package Consstructor;

public class HomeWork01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1.2,-23.2,44.1};
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println("arr的最大值是" + res);
        }else {
            System.out.println("arr输入有误，不能为{}或者null");
        }
    }
}
/**
 * 编写类A01，定义方法max,实现求某个double数组的最大值，并返回
 */
class A01{
    /**
     * 思路分析
     * 1，类名A01
     * 2，方法名max
     * 2.形参double[]
     * 4，返回值double
     */
    //Dpuble为包装类，可以返回null
    public Double max(double[] arr) {
        //如果数组是null的话，这里就是null.length 所以要加上不能为null
        //而且数组长度最少要一位，不然就会下标越界
        if (arr != null && arr.length > 0){
            //假定数组的第一个数为最大值
            double max = arr[0];
        //使用循环来进行比较
        for (int i = 1; i < arr.length; i++) {
            //如果后面的数比max大，那么就大的数赋值给max
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //返回最大值
        return max;
     }else{
        return null;
    }
    }
}
