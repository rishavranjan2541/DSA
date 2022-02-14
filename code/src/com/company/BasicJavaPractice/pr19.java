package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Surface area of cylinder
        System.out.println("Enter the radius of cylinder: ");
        double r = input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double h = input.nextDouble();
        double a = (44*r*h)/7;
        System.out.println("Surface area of cylinder is " + a);
    }
}
