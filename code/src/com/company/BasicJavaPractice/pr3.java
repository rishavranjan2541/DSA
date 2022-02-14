package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of rectangle
        System.out.print("Enter the length: ");
        int l = input.nextInt();
        System.out.print("Enter the width: ");
        int w = input.nextInt();
        float a = l * w;
        System.out.println("Area of rectangle of dimension " + l + " * " + w + " is " + a);
    }
}
