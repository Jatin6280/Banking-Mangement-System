    package com.company;
    import java.util.ArrayList;

    public abstract  class Account{

        protected String accountNo;
        protected double balance;

        public  Account(String accountNo,double balance){
            this.accountNo=accountNo;
            this.balance=balance;
        }
        public double getBalance(){
            return balance;
        }
        abstract void Withdraw(double amount);
        ArrayList<Double> transaction = new ArrayList<Double>();
        public void miniStatement(){
            int start = Math.max(0, transaction.size() - 5);
                for (int i=start;i<transaction.size();i++){
                    System.out.println((i+1)+". " + transaction.get(i));
                }
        };
        public void deposit(double amount) {
            if ( amount>0){
                balance +=amount;
                transaction.add(amount);
            }
            else {
                System.out.println("enter the amount");
            }
        }
    }
