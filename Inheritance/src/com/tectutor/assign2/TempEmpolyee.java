package com.tectutor.assign2;

import java.util.Scanner;

public class TempEmpolyee extends Employee{
    private String duration;

    private double amount;
    Scanner scan = new Scanner(System.in);

    @Override
    public void accept(){
        super.accept();
        System.out.println("Enter Duration");
        duration = scan.nextLine();
        System.out.println("Enter amount");
        amount = sc.nextDouble();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Duration: " + duration);
        System.out.println("Amount: " + amount);
    }
}
