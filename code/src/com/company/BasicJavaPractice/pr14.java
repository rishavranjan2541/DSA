package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Volume of cone
        System.out.println("Enter the radius: ");
        double r = input.nextInt();
        System.out.println("Enter the height: ");
        double h = input.nextInt();
        double v = (22*r*r*h)/21;
        System.out.println("Volume of cone is " + v);
    }
}
