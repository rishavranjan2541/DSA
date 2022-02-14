package com.company.BasicJavaPractice;

import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Volume of prism
        System.out.println("Enter the area of base");
        int a = input.nextInt();
        System.out.println("Enter the height of prism");
        int h = input.nextInt();
        int v = input.nextInt();
        System.out.println("Volume of prism is " + v);
    }
}
