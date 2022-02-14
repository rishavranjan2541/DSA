package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of equilateral triangle
        System.out.print("Enter the length of side");
        int s = input.nextInt();
        double a = (1.73 * s * s) / 4 ;
        System.out.println("Area of triangle of side " + s + " is " + a);
    }
}
