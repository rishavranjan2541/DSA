package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr8_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // To check for Armstrong number

        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int m = n;
        int r = 0;
        int s = 0;
        while (m != 0){
            r = m % 10 ;
            m = m / 10;
            s = s + (r*r*r);
        }
        if(s == n){
            System.out.println("The number is Armstrong number");
        }
        else {
            System.out.println("Number is not Armstrong number");
        }
    }
}
