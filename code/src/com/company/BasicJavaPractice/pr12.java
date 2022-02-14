package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of square
        System.out.println("Enter the length of side: ");
        int s = input.nextInt();
        int p = 4 * s;
        System.out.println("Perimeter of the square is " + p) ;
    }
}
