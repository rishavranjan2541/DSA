package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr1_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // To print factorial of the given number
        System.out.print("Enter the number to get the factorial: ");
        int n = in.nextInt();
        int factorial = 1;
        System.out.print(n + "! = ");
        for(int i = n; i > 0; i--){
            System.out.print(i + " ");
            if(i>1){
                System.out.print("* ");
            }
            factorial = factorial * i;
        }
        System.out.println("= " + factorial);
    }
}
