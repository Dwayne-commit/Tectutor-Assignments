package com.tectutor.assign2;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;

    protected Scanner sc;

    public Employee(){
        sc = new Scanner(System.in);
    }

    public void accept(){
        System.out.println(" Enter Employee id ");
        empId = sc.nextInt();
        System.out.println(" Enter Employee name ");
        empName = sc.next();
    }

    public void display(){
        System.out.println(" Employee id is " + empId);
        System.out.println(" Employee name is " + empName);
    }
}
