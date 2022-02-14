package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr25_Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // To print the largest number of all the numbers typed
        System.out.println("Enter the numbers: ");
        int n, large = 0;
        int l = 0;
        do {
            n = in.nextInt();
            if(n > l){
                large = n;
            }
            l = large;
        }while (n != 0);
        System.out.println("Largest of the numbers you typed is " + large);
    }
}
