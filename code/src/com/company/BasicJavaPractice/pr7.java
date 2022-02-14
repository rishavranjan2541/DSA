package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of rhombus
        System.out.println("Enter the length of diagonal 1: ");
        int d1 = input.nextInt();
        System.out.println("Enter the length of diagonal 2: ");
        int d2 = input.nextInt();
        float a = (d1 * d2) / 2;
        System.out.println("Area of the rhombus is " + a);
    }
}
