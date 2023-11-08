package Consstructor;

public class HomeWork03 {
    public static void main(String[] args) {
        Book book = new Book("斗破苍穹", 20);
        book.info();
        book.updatePrice();
        book.info();
    }
}

/**
 * 3.编写类Book,定义方法updatePrice,实现更改某本书的价格，
 * 具体:如果价格 > 150,则更改为150,如果价格> 100，更改为100，否则不变
 * 分析：
 * 1.类名 Book
 * 2.方法名 updatePrice
 * 3，属性 name,price
 */
class Book{
    String name;
    double price;

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        if (this.price > 150){
            //这个this代表的是类的属性
            this.price = 150;
        }else if (this.price > 100){
            this.price = 100;
        }
    }

    public void info(){
        System.out.println("书名：" + this.name + "\t价格：" + this.price);
    }
}