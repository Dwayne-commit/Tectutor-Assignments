package com.cognizant.emp;

public class Manager extends Employee{
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.basicSalary = basicSalary;
    }

    public void setemployeeId(long employeeId){
        this.employeeId = employeeId;
    }

    public long getemployeeId(){
        return this.employeeId;
    }

    public void setemployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getemployeeName(){
        return this.employeeName;
    }

    public void setemployeeAddress(String employeeAddress){
        this.employeeAddress = employeeAddress;
    }

    public String getemployeeAddress(){
        return this.employeeAddress;
    }

    public void setbasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public double getbasicSalary(){
        return this.basicSalary;
    }

    public void calculateSalary(){
        double sal = getbasicSalary() + ( getbasicSalary() * specialAllowance/100) + ( getbasicSalary() * Hra/100);
        System.out.println(sal);
    }

    @Override
    public void calculateTransportAllowance(){
        double transportallowance = 15 * basicSalary/100;
        System.out.println(transportallowance);
    }
}
