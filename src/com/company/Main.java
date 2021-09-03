package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENTAGE = 100;

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest rate:");
        float monthlyInterestRate = scanner.nextFloat() / PERCENTAGE / MONTHS_IN_A_YEAR;

        System.out.print("Period (Years) 1000:");
        float period = scanner.nextByte() * MONTHS_IN_A_YEAR;

        double mortgage = principal * (monthlyInterestRate * ((Math.pow((1+monthlyInterestRate),period)))/((Math.pow((1+monthlyInterestRate),period)) - 1));

        String mortgageValue = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageValue);
    }
}
