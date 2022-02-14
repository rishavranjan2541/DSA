package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr12_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // HCF of two number
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int l , m;

        // to give the largest input to l and smallest to m
        if(b>a){
            l = b;
            m = a;
        }
        else {
            l = a;
            m = b;
        }

        // Loop to find HCF i.e smallest divisor at the stage of zero remainder
        int rem = 1;
        while (rem != 0){
            rem = l % m;
            l = m;
            m = rem;
        }
        System.out.println("HCF of (" + a + ", " + b + ") is " + l);


//        // Alternative method
//        int hcf = 0;
//        for (int i = 1; i <= m ; i++){
//            if(l % i == 0 && m % i == 0){
//                hcf = i;
//            }
//        }
//        System.out.println(hcf);
    }
}
