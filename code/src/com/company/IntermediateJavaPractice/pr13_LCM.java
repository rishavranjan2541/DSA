package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr13_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // LCM
        System.out.println("Enter the two numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        int l, m;

        // to assign the greater number to l and smaller to m
        if(b > a){
            l = b;
            m = a;
        }
        else{
            l = a;
            m = b;
        }

        // to find the lcm
        // lcm(l, m) = (l*m)/hcf(l, m)
        int hcf = 0;
        for(int i = 1; i < m; i++){
            if(l%i == 0 && m%i == 0){
                hcf = i;
            }
        }
        int lcm = (l*m)/ hcf;
        System.out.println("LCM (" + l + ", " + m + ") is " + lcm);
    }
}
