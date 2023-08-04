package com.cognizant.emp;

public class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;

    public Employee(){}

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public void calculateSalary(){
        double sal = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
        System.out.println(sal);
    }

    public void calculateTransportAllowance(){
        double transportallowance = 0.1 * basicSalary;
        System.out.println(transportallowance);
    }
}
