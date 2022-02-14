package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);

        // Area of triangle
        System.out.print("Enter the base of the triangle: ");
        int b = intput.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = intput.nextInt();
        float a = ( b * h) / 2;
        System.out.println("Area of the triangle is " + a);
    }
}
