package Consstructor;

public class ThisDetatil {
    public static void main(String[] args) {
        T t = new T();
        t.f1();
    }
}

class T{

    public T(){
        this.f1();
        System.out.println("无参构造方法");
    }

    public T(String name,int age){
        this.f1();
        System.out.println("T(String name,int age)构造方法");
    }

    public void f1(){
        System.out.println("f1方法。。。");
    }

    public void f2(){
        System.out.println("f2方法。。。");
    }
}