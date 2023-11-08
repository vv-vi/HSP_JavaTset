package Consstructor;

public class HomeWork10 {
    public static void main(String[] args) {

    }
}

class Demo{
    int i= 100;
    public void m () {
        //这里就是把属性i赋值个j，然后i会自增+1，所以j就是100，i就是101
        int j=i++;
        System.out.println("i=" +i);
        System.out.println("j=" +j);
    }}
class Test{
    public static void main(String[] args){
        Demo d1 =new Demo();
        Demo d2 = d1;
        d2.m();
        //由于d1和d2都是指向的同一个对象，所以这里的也是101
        System.out.println(d1.i);
        System.out.println(d2.i);
    }}

