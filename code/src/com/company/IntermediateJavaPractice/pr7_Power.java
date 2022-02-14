package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr7_Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Power of the number
        System.out.print("Enter the number: ");
        double n = in.nextDouble();
        System.out.print("Enter the power: ");
        double p = in.nextDouble();
        double s = Math.pow(n, p);
        System.out.println("Your answer is " + s);
    }
}
