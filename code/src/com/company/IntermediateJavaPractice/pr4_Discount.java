package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr4_Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Discount of Product
        System.out.println("Enter the price of the product: ");
        double p = in.nextDouble();
        System.out.println("Enter the percent of discount: ");
        double d = in.nextDouble();
        double c = p - ((p*d)/100);
        System.out.println("Your discounted price of the product is Rs" + c);
    }
}
