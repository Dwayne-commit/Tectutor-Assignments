package com.cognizant.intrest;

public class SimpleInterestCalculator {

    double principle;
    double amount;
    int numOfYrs;

    public SimpleInterestCalculator(double principle, int numOfYrs){
        this.principle = principle;
        this.numOfYrs = numOfYrs;
    }

    public void setPrinciple(double principle){
        this.principle = principle;
    }

    public double getPrinciple(){
        return this.principle;
    }



    public void setnumOfYrs(int numOfYrs){
        this.numOfYrs = numOfYrs;
    }

    public int getnumOfYrs(){
        return this.numOfYrs;
    }

    public void calculateSimpleInterest(double prin, int yrs){
        if(prin >= 100000){
            if(yrs >= 10){
                double si =  prin * yrs * 0.1;
                System.out.println("The Interest Amount for a principle of" + " " + prin + " and years " + yrs + " is " + si);
            }else if(yrs < 10){
                double si =  prin * yrs * 0.095;
                System.out.println("The Interest Amount for a principle of" + " " + prin + " and years " + yrs + " is " + si);
            }
        } else if(prin < 100000){
            if(yrs >= 10){
                double si =  prin * yrs * .05;
                System.out.println("The Interest Amount for a principle of" + " " + prin + " and years " + yrs + " is " + si);
            } else if(yrs < 10){
                double si =  prin * yrs * 0.045;
                System.out.println("The Interest Amount for a principle of" + " " + prin + "  and years " + yrs + " is " + si);
            }
        }
    }
}
