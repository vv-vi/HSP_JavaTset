package com.kaka.homework.hk08;

/**
 * 在上面类的基础上扩展新类CheckingAccount对每次存款和取款都收取1美元的手续费
 */
public class CheckingAccount extends BankAccount{//新账号

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
    }
}
