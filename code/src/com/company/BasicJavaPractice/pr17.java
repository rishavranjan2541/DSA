package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Volume of sphere
        System.out.println("Enter the radius of sphere: ");
        double r = input.nextDouble();
        double v = (88*r*r*r)/63;
        System.out.println("volume of sphere is " + v);
    }
}
