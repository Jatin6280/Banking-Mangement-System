package com.company;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    void Withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            transaction.add(amount);
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }
}