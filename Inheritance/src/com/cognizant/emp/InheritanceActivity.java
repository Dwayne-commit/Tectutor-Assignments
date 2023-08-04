package com.cognizant.emp;

public class InheritanceActivity {
    public static void main(String[] args){
        Manager mn = new Manager(126534,"Peter","Chennai India",237844,65000);
        mn.calculateSalary();

        Trainee tn = new Trainee(29846,"Jack","Mumbai India",442085,45000);
        tn.calculateSalary();

        mn.calculateTransportAllowance();
        tn.calculateTransportAllowance();
    }
}
