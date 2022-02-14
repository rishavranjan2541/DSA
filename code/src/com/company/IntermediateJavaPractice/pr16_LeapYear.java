package com.company.IntermediateJavaPractice;

import java.time.Year;
import java.util.Scanner;

public class pr16_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leap year
        System.out.println("Enter the year");
        int y = in.nextInt();
        if(y%4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println("Year " + y + " is  a leap year");
                } else {
                    System.out.println("Year " + y + " is not a leap year");
                }
            }
            else{
                System.out.println("Year " + y + " is  a leap year");
            }
        }
        else{
            System.out.println("Year " + y + " is not a leap year");
        }

    }
}
