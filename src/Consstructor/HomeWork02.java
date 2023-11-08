package Consstructor;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] strs = {"lbh","hj","zj","hsp"};//"lbh","hj","zj","hsp"
        A02 a02 = new A02();
        int a= a02.find("zj",strs);
        System.out.println("索引下标为" + a);

    }
}
/**
 * 2.编写类A02,定义方法find,实现查找某字符串是否在数组中，并返回索引
 * 如果找不到，返回-1
 *
 * 分析：
 * 1.类名A02，
 * 方法名find
 *形参char a
 * 返回参数 int
 */
class A02{
    public int find(String findStr,String[] strs){
        if (strs != null) {
            //直接遍历,如果找到所需要的字符，返回索引
            for (int i = 0; i < strs.length; i++) {
                if (findStr.equals(strs[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}


