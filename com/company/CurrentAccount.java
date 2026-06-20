package com.company;

public class CurrentAccount extends Account {
    private double overdraftLimit = 10000;
    @Override
    void Withdraw(double amount) {

        if(balance -amount< -overdraftLimit){
            System.out.println("overdraft limit exceeded");
        }

        else {
            balance -= amount;
            transaction.add(amount);
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }

    public CurrentAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

}
