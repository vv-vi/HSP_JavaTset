package com.kaka.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建acount
        Account account = new Account();
        account.setName("小王");
        account.setBalance(101);
        account.setPwd("123456");
        account.info();
    }
}
