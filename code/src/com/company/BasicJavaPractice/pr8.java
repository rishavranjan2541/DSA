package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of circle
        System.out.println("Enter the radius of the circle: ");
        int r = input.nextInt();
        float p = (44*r) / 7;
        System.out.println("Perimeter of circle is " + p);

    }
}
