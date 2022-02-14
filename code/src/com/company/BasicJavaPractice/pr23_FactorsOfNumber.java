package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr23_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Factors of a number

        // Taking input
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        // Loop for checking the factors
        for (int i = 1 ; i <= n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

    }
}
