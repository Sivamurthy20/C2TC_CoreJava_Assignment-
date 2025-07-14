package com.Sivamurthy.Assignment3;

import com.Sivamurthy.Assignment3.Abstract.*;
import com.Sivamurthy.Assignment3.Final.*;
import com.Sivamurthy.Assignment3.Static.Bank;

public class Main {
    public static void main(String[] args) {
        new Bank();
        System.out.println("Total bank accounts: " + Bank.getTotalAccounts());

        // Abstract(SavingsAccount)
        SavingsAccount savings = new SavingsAccount(5000);
        savings.deposit(1500);
        savings.withdraw(1000);
        System.out.println("Savings Balance: " + savings.getBalance());

        // Abstract(CheckingAccount)
        CheckingAccount checking = new CheckingAccount(3000);
        checking.deposit(1000);
        checking.withdraw(500);
        System.out.println("Checking Balance: " + checking.getBalance());

        // Final
        Transaction txn = new Transaction();
        txn.performTransaction("Withdraw", 500, savings.getBalance());
    }
}
