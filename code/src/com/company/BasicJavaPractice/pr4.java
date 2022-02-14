package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of isosceles triangle
        System.out.print("Enter the base of triangle: ");
        int b = input.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = input.nextInt();
        float a = ( b * h ) / 2;
        System.out.println("Area of the triangle is " + a);
    }
}
