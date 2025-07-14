package com.Sivamurthy.Assignment3.Abstract;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
