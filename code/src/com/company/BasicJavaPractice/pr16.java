package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // volume of cylinder
        System.out.println("Enter the area of radius of cylinder: ");
        double r = input.nextDouble();
        System.out.println("Enter the height of cylinder: ");
        double h = input.nextDouble();
        double v = (22*r*r*h)/7;
        System.out.println("Volume of cylinder is " + v);
    }
}
