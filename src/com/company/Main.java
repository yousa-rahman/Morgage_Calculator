package com.company;

public class Main {

    public static void main(String[] args) {

        int principal;
        float annualInterestRate;
        byte years;

        principal = (int) Console.readNumber("Principal($1K - $1M)",1000,1_000_000);
        annualInterestRate = (float) Console.readNumber("Annual Interest rate", 1,30);
        years = (byte) Console.readNumber("Period (Years)",1,30);

        var calculator = new MortgageCalculator(principal, annualInterestRate, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
