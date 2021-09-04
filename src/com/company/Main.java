package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENTAGE = 100;
        int principal;
        float monthlyInterestRate;

	    Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Principal ($1K - $1M):");
            principal = scanner.nextInt();

	        if(principal >= 1000 && principal <= 1_000_000)
	            break;

	        System.out.println("Enter a number between 1,000 and 1,000,000");

	    }

        while (true){
            System.out.print("Annual Interest rate:");
            monthlyInterestRate = scanner.nextFloat() / PERCENTAGE / MONTHS_IN_A_YEAR;

            if(monthlyInterestRate >= 1 && monthlyInterestRate <= 30)
                break;

            System.out.println("Enter a number between 1 and 30");
        }


        System.out.print("Period (Years) 1000:");
        float period = scanner.nextByte() * MONTHS_IN_A_YEAR;

        double mortgage = principal * (monthlyInterestRate * ((Math.pow((1+monthlyInterestRate),period)))/((Math.pow((1+monthlyInterestRate),period)) - 1));

        String mortgageValue = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageValue);
    }
}
