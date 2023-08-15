package Method;

public class Method01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.speak();
        person.cal01();
        person.cal02(10000);

        int sum = person.getSum(20, 40);
        System.out.println("getSum方法的结果为：" + sum);
    }

}
class Person{
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int res = 0;
        for (int i = 1; i <= 1000 ; i++){
            res += i;
        }
        System.out.println("计算的结果为：" + res);
    }
    public void cal02(int n){
        int res = 0;
        for (int i = 1; i <= n ; i++){
            res += i;
        }
        System.out.println("计算的结果为：" + res);
    }
    public int getSum(int n, int m){
        int res = n + m;
        return res;
    }
}
