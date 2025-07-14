package com.Sivamurthy.Assignment3.Final;

public class Transaction {
    public final double transactionFee = 2.0;

    public final void performTransaction(String type, double amount, double balance) {
        System.out.println("Transaction Type: " + type);
        System.out.println("Transaction Amount: " + amount);
        System.out.println("Transaction Fee: " + transactionFee);
        System.out.println("Balance after Transaction: " + (balance - amount - transactionFee));
    }
}
