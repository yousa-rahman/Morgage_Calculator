package com.company;

import java.util.Scanner;

public class Console {
    private static  final Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max){
        double value;
        while(true){
            System.out.print(prompt + ":");
            value = scanner.nextDouble();

            if(value >= min && value <= max)
                break;

            System.out.println("Enter a number between " + (int)min + " and " + (int)max);
        }
        return value;
    }
}
