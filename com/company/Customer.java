package com.company;
import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    ArrayList<Account>accounts= new ArrayList<Account>();
    public void addAccount(Account account){
        accounts.add(account);
    }
    public String getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
    public Customer(String customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }
}
