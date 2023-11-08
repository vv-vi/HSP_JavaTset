package com.kaka.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        /**
         * 1.化繁为简
         * 1.1先把菜单显示做出来，因为菜单必须显示一次，所以用do-while循环
         */
        //定义相关变量控制菜单退出
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";
        //老韩思路，(1)可以把收益入账和消费，保存到数组(2)可以使用对象(3)简单的话可以使用String拼接
        String detail = "---------------------零钱通明细-------------------";
        //收入
        double money = 0;
        //余额
        double balance = 0;
        //日期
        Date date = null;
        //消费
        String note = null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


        //具体实现代码
        do {
            //菜单界面
            System.out.println("\n============零钱通菜单================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退   出");

            System.out.print("请选择1-4:");
            //接收用户输入的序号
             key = sc.next();

             //实现Switch分支控制
            switch (key){
                case "1" :
                    System.out.println("1 零钱通明细");
                    System.out.println(detail);
                    break;
                case "2" :
                    System.out.print("收益入账金额：");
                    money = sc.nextDouble();
                    if(money <= 0){
                        System.out.println("收益入账金额必须大于等于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息
                    date = new Date();
                    //拼接收入信息到details
                    detail += "\n收益入账\t\t+" + money + "\t\t" + sdf.format(date) +  "\t余额" + balance;
                    break;
                case "3" :
                    System.out.print("消费说明：");
                    note = sc.next();

                    System.out.print("消费金额：");
                    money = sc.nextDouble();
                    //找出金额不正确的情况
                    if (money <= 0 || money > balance){
                        System.out.println("您的消费金额必须在0-" + balance + "之间");
                        break;
                    }
                    balance -= money;
                    date = new Date();
                    //拼接消费信息到details
                    detail += "\n" + note + "\t\t-" + money + "\t\t" + sdf.format(date) +  "\t余额" + balance;
                    break;
                case "4" :
                    /**
                     * 思路
                     * 1.首先要定义一个变量来接受
                     * 2，使用while+break来判断输入的字母是不是y或者n
                     *3.退出while后，在判断choice是否是y还是n，就可以决定是否退出
                     */
                   String choice = "";
                   while (true){
                       System.out.println("确定要退出吗：y/n");
                       choice = sc.next();
                       if ("y".equals(choice) || "n".equals(choice)){
                           break;
                       }
                   }
                   if (choice.equals("y")) {
                       loop = false;
                   }
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        }while (loop);

        System.out.println("退出了零钱通项目");
    }
}
