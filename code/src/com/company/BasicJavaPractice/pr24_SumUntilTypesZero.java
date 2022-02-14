package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr24_SumUntilTypesZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Typing integers until type zero and giving the usm of all the integer typed
        System.out.println("Start typing the integers: ");
        int n;
        int sum = 0;
        do{
            n = in.nextInt();
            sum = sum + n;
        }while(n != 0);
        System.out.println("The sum of all the integers you typed is " + sum);
    }
}
