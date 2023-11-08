package Consstructor;

public class HomeWork08 { //公有类
    int count = 9;
    public void count1() {//公有类的成员方法
    count = 10;//这个count就是属性，改成10
        System.out.println(" count1=" + count);
    }
    public void count2(){//公有类的成员方法
        System.out.println("count2=" + count++);
    }
    //公有类的main方法，每个类都可有main方法
    public static void main (String args[]){
        /**
         * new HomeWork08()就是匿名对象，匿名对象只能用一次，使用后就销毁
         * new HomeWork08().count1(); 创建好HomeWork08的匿名对象后就调用count1
         * 随着调用结束，这个对象就会被销毁
         */
        new HomeWork08().count1();
        /**
         * 这里新创建了一个对象，会在堆里面开辟一个新的空间，因为count2是后++
         * 所以就会先输出后自增所以就是9，然后在堆的空间里面就变成了10，
         * 第二次调用count2的时候就是输出10，然后堆的空间就变成11
         *
         */
        HomeWork08 h1 = new HomeWork08();

        h1.count2();
        h1.count2();
    }
}

