package Consstructor;

public class HomeWork13 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        PassObject po = new PassObject();
        po.printAreas(circle1,5);

    }
}
/**
 * 13.将对象作为参数传递给方法。Homework13.java
 * 题目要求:
 * (1)定义一个Circle类,包含一个double型的radius属性代表圆的半径， findArea()方
 * 法返回圆的面积。
 * (2)定义一个类PassObject,在类中定义一个方法printAreas(), 该方法的定义如下:
 * public void printAreas(Circle C, int times) //方法签名
 * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
 * 例如，times为5, 则输出半径1, 2, 3, 4, 5,以及对应的圆面积。
 * (4)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果
 */
class Circle1{
    //半径
    double radius;

    public double findArea(){
        return Math.PI * radius * radius;
    }
//这个方法的作用就是把当前对象的半径值改成新的半径值
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class  PassObject{
    public void printAreas(Circle1 c, int times){
        System.out.println("radius\t\tarea");
        //输出1到times之间的每个整数半径值
        for (int i = 1;i <= times;i++){
            //这里的i就是就是修改半径的作用
            c.setRadius(i);
            System.out.println((double) i + "\t\t" + c.findArea());
        }
    }
}
