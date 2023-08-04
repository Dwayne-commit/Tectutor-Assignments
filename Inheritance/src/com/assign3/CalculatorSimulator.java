package com.assign3;

public class CalculatorSimulator {
    public static void main(String[] args){
        double tax;
        TaxCalculator t1 = new TaxCalculator();
        t1.empName = "Ron";
        t1.isIndian = false;
        t1.empSal = 34000;
        tax=t1.calculateTax(t1.empName,t1.isIndian,t1.empSal);
        if(tax>0)
            System.out.println("Tax amount is "+tax);


        t1.empName = "Tim";
        t1.isIndian = true;
        t1.empSal = 1000;
        tax=t1.calculateTax(t1.empName,t1.isIndian,t1.empSal);
        if(tax>0)
            System.out.println("Tax amount is "+tax);


        t1.empName = "Jack";
        t1.isIndian = true;
        t1.empSal = 55000;
        tax=t1.calculateTax(t1.empName,t1.isIndian,t1.empSal);
        if(tax>0)
            System.out.println("Tax amount is "+tax);


        t1.empName = null;
        t1.isIndian = true;
        t1.empSal = 30000;
        tax=t1.calculateTax(t1.empName,t1.isIndian,t1.empSal);
        if(tax>0)
            System.out.println("Tax amount is "+tax);
    }
}
