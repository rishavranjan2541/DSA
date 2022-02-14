package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of circle
        System.out.println("Enter the radius of the circle: ");
        int r = input.nextInt();
        double a = (22 * r * r) / 7;
        System.out.println("Area of circle of radius " + r + " is " + a);
    }
}
