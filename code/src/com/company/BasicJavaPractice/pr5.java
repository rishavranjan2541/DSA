package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of parallelogram

        System.out.print("Enter the base of parallelogram: ");
        int b = input.nextInt();
        System.out.print("Enter the height of parallelogram: ");
        int h = input.nextInt();
        float a = b * h;
        System.out.println("Area of the parellogram is " + a);
    }
}
