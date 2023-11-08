package com.kaka.homework.hk08;

public class HomeWork08 {
    public static void main(String[] args) {
//        CheckingAccount account = new CheckingAccount(1000);
//        account.deposit(100);
//        account.withdraw(10);
//        System.out.println(account.getBalance());

        //存钱
        SavingAccount account1 = new SavingAccount(1000);
        account1.deposit(100);//免手续费3次
        account1.deposit(100);
        account1.deposit(100);
        System.out.println(account1.getBalance());//1300
        account1.deposit(100);//次数用完，多一块手续费，
        System.out.println(account1.getBalance());//1399

        //月初定时器，重置免手续费次数
        account1.earnMonthlyInterest();
        System.out.println(account1.getBalance());//+百分之1的利息1399 + 13.99 = 1412.99
        account1.withdraw(100);//免手续费-100
        account1.withdraw(100);//-100
        account1.withdraw(100);//-100
        System.out.println(account1.getBalance());//1112.99
        account1.deposit(100);
        System.out.println(account1.getBalance());//1211.99



    }
}
