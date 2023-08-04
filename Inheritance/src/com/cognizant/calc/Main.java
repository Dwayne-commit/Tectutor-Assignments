package com.cognizant.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides of the shape");
        int sid;

        do{
            sid = sc.nextInt();
            switch(sid){
                case 3:
                    System.out.println("Enter the length");
                    int lio = sc.nextInt();
                    ShapeArea ar = new ShapeArea(sid,lio);
                    ar.calculateShapeArea(sid);
                    break;
                case 4:
                    System.out.println("Enter the length");
                    int yio = sc.nextInt();
                    ShapeArea yt = new ShapeArea(sid,yio);
                    yt.calculateShapeArea(sid);
                    break;
                case 5:
                    System.out.println("Enter the length");
                    int hio = sc.nextInt();
                    ShapeArea re = new ShapeArea(sid,hio);
                    re.calculateShapeArea(sid);
            }
        }while(sid == 3 && sid == 4 && sid >= 5);
    }
}
