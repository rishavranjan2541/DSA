package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr3_AverageOf_n_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Average of n numbers
        System.out.print("Enter the numbers of the entries: ");
        int n = in.nextInt();
        System.out.print("Enter the numbers: ");
        float sum = 0f;
        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            sum = sum + a;
        }
//        System.out.println(sum);
        double average = sum/n;
        System.out.println("Average of the numbers is " + average);
    }
}
