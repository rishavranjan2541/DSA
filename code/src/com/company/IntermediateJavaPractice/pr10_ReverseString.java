package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr10_ReverseString {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        // Reverse String
        System.out.println("Enter the String");
        String a = string.nextLine();
//        System.out.println(a.charAt(3));
        int l = a.length();
        String rev = "";
        for (int i = l-1; i >= 0 ; i--){
            rev = rev + a.charAt(i);
        }
        System.out.println("The reverse of your string is \"" + rev + "\"");
    }
}
