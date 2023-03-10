package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome! You're setting up a new account. Please enter your name: ");
        String name = scan.nextLine();
        Account account = new Account(name);

        System.out.println("Account created. Please type the number of the action you want to execute:");
        System.out.println("1 - Make a deposit");
        System.out.println("2 - Make a withdrawal");
        System.out.println("3 - Exit");

        int option = Integer.parseInt(scan.nextLine());

        if (option != 1 && option != 2 && option != 3){
            System.out.println("Action invalid. Please type: ");
            System.out.println("1 - Make a deposit");
            System.out.println("2 - Make a withdrawal");
            System.out.println("3 - Exit");
            option = Integer.parseInt(scan.nextLine());
        }
        System.out.print(option);
    }
}
