package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr21_Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fibonacci Series

        // Taking the input of number of terms
        System.out.print("Enter the number to terms: ");
        int n = input.nextInt();
        int a = 1;
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        // loop to print the next terms
        for (int i = 1; i < n-1; i++ ){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
