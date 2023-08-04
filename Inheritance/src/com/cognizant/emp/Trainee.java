package com.cognizant.emp;

public class Trainee extends Employee{
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.basicSalary = basicSalary;
    }
}
