package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr17_SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Sum of all negative numbers, all positive odd numbers , all positive even number
        System.out.println("Enter the integers");
        int n;
        int nSum = 0;
        int oSum = 0;
        int eSum = 0;
        do {
            n = in.nextInt();
            if(n<0){
                nSum = nSum + n;
            }
            else if(n>0){
                if(n%2 == 0){
                    eSum = eSum + n;
                }
                else if(n%2 != 0){
                    oSum = oSum + n;
                }
            }
        }while(n != 0);

        System.out.println("Total sum of all the negative numbers you typed is "+nSum);
        System.out.println("Total sum of all the positive even number is "+eSum);
        System.out.println("Total sum of all the positive odd number is "+oSum);
    }

}
