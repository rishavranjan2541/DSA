package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr6_CommissionPercent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Commission Percent
        System.out.println("Enter the amount : ");
        double a = in.nextDouble();
        System.out.println("Enter the commission price : ");
        double c = in.nextDouble();
        double p = (c*100)/a;
        System.out.println("Your commission percent is " + p + "%");
    }
}
