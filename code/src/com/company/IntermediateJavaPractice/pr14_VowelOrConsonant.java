package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr14_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Vowel or Consonant

        System.out.println("Enter a character to check for vowel or consonant");
        char c = in.next().charAt(0);
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'  || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            System.out.println("The character you entered is vowel.");
        }
        else{
            System.out.println("The character you entered is consonant.");
        }

    }
}
