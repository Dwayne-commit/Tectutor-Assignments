package com.cognizant.calc;

public class ShapeArea {

    int numberOfSides;
    int length;

    public ShapeArea(int numberOfSides, int length){
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    public void setnumberOfSides(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides(){
        return this.numberOfSides;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public void calculateShapeArea(int si){
        if(si == 3){
            double a = (Math.sqrt(3)/4) * getLength() * getLength();
            System.out.println(a);
        } else if(si == 4){
            double b = getLength() * getLength();
            System.out.println(b);
        } else {
            System.out.println("No Shapes Present");
        }
    }
}
