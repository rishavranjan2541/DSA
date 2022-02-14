package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of parallelogram
        System.out.println("Enter the length: ");
        int l = input.nextInt();
        System.out.println("Enter the breadth: ");
        int b = input.nextInt();
        int p = 2 * ( l + b);
        System.out.println("Perimeter of parallelogram is " + p );
    }
}
