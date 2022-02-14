package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr15_PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Perfect Number - number that is equal to sum of it's divisors
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
//        System.out.println(sum);
        if(sum == n){
            System.out.println("Your number is a perfect number.");
        }
        else{
            System.out.println("Your number is not a perfect number.");
        }
    }
}
