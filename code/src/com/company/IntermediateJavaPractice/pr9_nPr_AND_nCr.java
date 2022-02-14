package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr9_nPr_AND_nCr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Find nPr and nCr
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the value of r");
        int r = in.nextInt();

        // factorial of n
        double n1 = 1;
        for (int i = n; i > 0; i--){
            n1 = n1 * i;
        }
//        System.out.println(n1);

        // factorial of r
        double r1 = 1;
        for (int i = r; i > 0; i--){
            r1 = r1 * i;
        }
//        System.out.println(r1);

        // factorial of s = n - r
        double s = 1;
        for (int i = (n-r); i > 0; i--){
            s = s * i;
        }
//        System.out.println(s);

        // Value of nPr
        double nPr = n1/s;
        System.out.println("The value of nPr is " + nPr);

        // Value of nCr
        double nCr = n1/(s*r1);
        System.out.println("The value of nCr is " + nCr);
    }
}
