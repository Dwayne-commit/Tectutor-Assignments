package com.cognizant.intrest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SimpleInterestCalculator sim = new SimpleInterestCalculator(100000,12);
       sim.calculateSimpleInterest(sim.getPrinciple(),sim.getnumOfYrs());
    }
}
