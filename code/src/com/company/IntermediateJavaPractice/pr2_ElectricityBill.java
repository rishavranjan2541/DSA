package com.company.IntermediateJavaPractice;

import java.util.Scanner;

public class pr2_ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // To find electricity bill
        System.out.println("Enter the cost per unit(kWh): ");
        double cost = in.nextDouble();
        System.out.println("Enter the reading of your electric meter in kWh : ");
        double read = in.nextDouble();
        double bill = cost * read;
        System.out.println("Your electricity bill is Rs" + bill);
    }
}
