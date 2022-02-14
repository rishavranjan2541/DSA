package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Surface area of cube
        System.out.println("Enter the edge length of cube : ");
        double a = input.nextDouble();
        double s = 6*a*a;
        System.out.println("Surface area of cube is " + s);
    }
}
