package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr22_Sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Subtract the sum and product of digits of the number

        // Taking the number
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        //Sum of the digits
        int sum = 0;
        int product = 1;
        while (n != 0) {
            sum = sum + (n % 10);
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println("Sum of the digits of the number is " + sum);
        System.out.println("product of the digits of the number is " + product);

        System.out.println("Difference of the sum and product is " + (product - sum) );
    }
}
