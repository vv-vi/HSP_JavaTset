package Consstructor;

public class HomeWork04 {
    public static void main(String[] args) {
        int[] oldArr = {10,20,30};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("====数组遍历结果=====");
        for (int i = 0; i < newArr.length;i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}
/**
 *4.编写类AO3,实现数组的复制功能copyArr,输入旧数组，返回一个新数组，元素和旧数组一样
 */
class A03{
    public int[] copyArr(int[] oldArr){
        //创建一个新数组，其大小和旧数组一样
        int[] newArr = new int[oldArr.length];
        //遍历数组，把旧数组的值给新数组
        for (int i = 0; i < oldArr.length; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}