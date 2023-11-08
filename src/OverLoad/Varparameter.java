package OverLoad;

public class Varparameter {
    /**
     * 可变参数
     */
    public static void main(String[] args) {
        Method m = new Method();
        System.out.println(m.sum(100,2,3));
    }
}

class Method{
    //int... 表示接受的可变参数，类型是int类型，即是可以接受（0-多）个参数
    //使用可变参数的时候可以当成数组来使用，把nums当成数组
    //遍历求和
    public int sum(int... nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }
}
