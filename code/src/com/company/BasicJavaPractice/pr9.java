package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of equilateral triangle
        System.out.println("Enter the side length of the triangle: ");
        int s = input.nextInt();
        int p = 3*s;
        System.out.println("Perimeter of equilateral triangle is " + p);
    }
}
