package com.company;

/**
 * Created by kd944 on 10/4/17.
 */
public class BankAccount {

    public double balance;
    public String name = "";
    public double deposit;
    public double withdraw;


    public BankAccount(String n, double b){

        balance = b;
        name = n;

    }

    public void Deposit(double d){

        deposit = d;
        balance+= d;

    }

    public void Withdraw(double w){

        w = withdraw;
        balance-= w;

    }
    
    public double myAccount(){
        
    }

}
