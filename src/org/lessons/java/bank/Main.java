package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome! You're setting up a new account. Please enter your name: ");
        String name = scan.nextLine();
        Account account = new Account(name);

        int option;

        System.out.println("Hello " + account.getClientName() + "! Account created.");

        do {
            System.out.println("Please type the number of the action you want to execute:");
            System.out.println("1 - Make a deposit");
            System.out.println("2 - Make a withdrawal");
            System.out.println("3 - Account info");
            System.out.println("4 - Exit");
            option = Integer.parseInt(scan.nextLine());

            while(option != 1 && option != 2 && option != 3 && option != 4) {
                System.out.println("Command not found");
                System.out.println("Please enter 1 for Deposits, 2 for Withdrawals or 3 to Exit");
                option = Integer.parseInt(scan.nextLine());
            }

            if(option == 1){
                System.out.println("How much would you like to deposit?");
                double amount = Integer.parseInt(scan.nextLine());
                while (amount < 1) {
                    System.out.println("The amount must be positive. Try again: ");
                    amount = Integer.parseInt(scan.nextLine());
                }
                if(account.depositFunds(amount)){
                    System.out.println("Deposit was successful. Your current balance is: " + account.getBalance() + " €");
                }else{
                    System.out.println("Deposit unsuccessful.");
                }
            }else if(option == 2){
                System.out.println("How much would you like to draw?");
                double amount = Integer.parseInt(scan.nextLine());
                while (amount < 1) {
                    System.out.println("The amount must be positive. Try again: ");
                    amount = Integer.parseInt(scan.nextLine());
                }
                if(account.withdrawFunds(amount)){
                    System.out.println("Withdrawal was successful. Your current balance is: " + account.getBalance() + " €");
                }else{
                    System.out.println("Withdrawal unsuccessful.");
                }
            }else if(option == 3){
                System.out.println("Client name: " + account.getClientName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Balance: " + account.getBalance() + " €");
            }else{
                System.out.println("Goodbye!");
            }

        }
        while (option != 4);

    }
}
