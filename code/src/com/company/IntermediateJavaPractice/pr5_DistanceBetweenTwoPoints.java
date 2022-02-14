package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr5_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Distance between two points
        System.out.println("Distance between two points");
        System.out.print("Enter the x and y coordinate of the point1 : ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter the x and y coordinates of the point2 : ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double r1 = x1 - x2;
        double r2 = y1 - y2;
        double sqr1 = Math.pow(r1, 2);
//        System.out.println(sqr1);
        double sqr2 = Math.pow(r2, 2);
//        System.out.println(sqr2);
        double rt = Math.sqrt(sqr1 +sqr2);
        System.out.println("Distance between two points is " + rt);


    }
}
