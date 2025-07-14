package com.Sivamurthy.Assignment3.Abstract;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
