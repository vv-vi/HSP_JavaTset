package Consstructor;

public class HomeWork07 {
    public static void main(String[] args) {
        Dogs dogs = new Dogs("旺财",19,"黄色");
        dogs.show();
    }
}

class Dogs{
    String name;
    int age;
    String color;

    public Dogs(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void show(){
        System.out.println("名字=" + this.name + "年龄=" + this.age + "颜色=" + color);
    }
}