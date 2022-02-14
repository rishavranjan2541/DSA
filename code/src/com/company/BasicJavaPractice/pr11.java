package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of ractangle
        System.out.println("Enter the length of rectangle: ");
        int l = input.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int w = input.nextInt();
        int p = 2 * ( l + w );
        System.out.println("Perimeter of rectangle is " + p );
    }
}
