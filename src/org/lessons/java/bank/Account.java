package org.lessons.java.bank;

import java.util.Random;

public class Account {

    //Campi
    private int accountNumber;
    private String clientName;
    private double balance;

    //Costruttore

    public Account(){
        balance = 0.0;
    }

    public Account(String clientName) {
        this.clientName = clientName;
        Random rnd = new Random();
        accountNumber = rnd.nextInt(1, 100000);
        balance = 0.0;
    }

    //Getter e setter
    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    // Metodi
    @Override
    public String toString(){
        return "Hello, " + clientName + ". " + "Your account number is " + accountNumber + " and your balance adds up " +
                "to: " + balance + " €";
    }


    public boolean depositFunds(double amount){
        if(amount >= 1){
            balance+= amount;
            return true;
        }else {
            return false;
        }
    }

    public boolean withdrawFunds(int amount){
        if(amount < balance){
            balance-= amount;
            return true;
        }else {
            return false;
        }
    }

}
