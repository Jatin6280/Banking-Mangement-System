    package com.company;
    import  java.util.Scanner;
    import java.sql.*;
    // At top of Main.java

    public class Main {
        public static void main(String[] args)

        {
            // In your Main.java add this:

                CustomerDAO customerDAO = new CustomerDAO();

            Customer c = new Customer("C003", "Jatin", "jatin@gmail.com");

            customerDAO.addCustomer(c);

            System.out.println("Customer added successfully!");
            Scanner sc = new Scanner(System.in);
            Customer cust = new Customer("jatin3445t","Jatin","hasijajatin@gmail.com");

            Account sa = new SavingsAccount("ACC001", 5000);
            Account ca = new CurrentAccount("ACC002", 3445);
            cust.addAccount(sa);
            cust.addAccount(ca);
            System.out.println("Choose account: saving or current");
            String accountChoice = sc.next();

            Account  selected = null;
            if(accountChoice.equals("saving")){
                selected = sa;
            }
            if(accountChoice.equals("current")){
                selected = ca;
            }

            while(true){
                System.out.println("menu \n 1. Deposit(dep)\n  2. Withdraw(wtd)\n 3. Check Balance(cba)\n 4. Mini Statement(ms)\n 5. Exit(e)");


                String choice = sc.next();
                if(choice.equals("e")){
                    sc.close();
                    break;
                }
                if(choice.equals("dep")){
                    System.out.println("enter amount");
                    double amount  = sc.nextDouble();
                    selected.deposit(amount);
                }
                if(choice.equals("wtd")){
                    System.out.println("enter amount");
                    double amount  = sc.nextDouble();
                    selected.Withdraw(amount);
                }
                if(choice.equals("ms")){
                    selected.miniStatement();
                }
                if(choice.equals("cba")){
                    System.out.println( "Balance"+selected.getBalance());
                }

            }
        }
    }
