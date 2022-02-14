package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter fo rhombus
        System.out.println("Enter the side length of rhombus: ");
        int s = input.nextInt();
        int p = 4*s;
        System.out.println("Perimeter of rhombus is " + p);
    }
}
