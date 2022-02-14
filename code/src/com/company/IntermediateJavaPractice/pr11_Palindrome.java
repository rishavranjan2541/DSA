package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr11_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Palindrome number - number which is reads same from both ends
        System.out.println("Enter the number ");
        int n = in.nextInt();
        int m = n;
        int rev = 0;
        while (m != 0) {
            int rem = m % 10;
            rev = (rev * 10) + rem;
            m = m / 10;
        }
        System.out.println("Reverse of the number is " + rev);
        if (rev == n) {
            System.out.println("Your number is palindrome");
        }
        else{
            System.out.println("Your number is not palindrome");
        }
    }
}
