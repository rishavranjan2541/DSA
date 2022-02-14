package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // volume of pyramid
        System.out.println("Enter the base length of pyramid: ");
        double b = input.nextDouble();
        System.out.println("Enter the base length of the pyramid: ");
        double l = input.nextDouble();
        System.out.println("Enter the height of the pyramid: ");
        double h = input.nextDouble();
        double v = ( l * h * b)/ 3;
        System.out.println("volume of the pyramid is " + v);
    }
}
