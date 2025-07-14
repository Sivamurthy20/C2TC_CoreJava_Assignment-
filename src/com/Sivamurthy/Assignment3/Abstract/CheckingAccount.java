package com.Sivamurthy.Assignment3.Abstract;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
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
            System.out.println("Insufficient balance in Checking Account");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
