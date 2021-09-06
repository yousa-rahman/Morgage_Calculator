package com.company;

public class MortgageCalculator {
    private final static byte MONTHS_IN_A_YEAR = 12;
    private final static byte PERCENTAGE = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double mortgageCalculator(){
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();

        return principal * (monthlyInterestRate * ((Math.pow((1+monthlyInterestRate),numberOfPayments)))/((Math.pow((1+monthlyInterestRate),numberOfPayments)) - 1));
    }


    public double calculateBalance(short numberOfPaymentsMade){

        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();

        double balance =  principal *
                ((Math.pow((1 + monthlyInterestRate),numberOfPayments)-Math.pow((1 + monthlyInterestRate),numberOfPaymentsMade))
                /(Math.pow((1 + monthlyInterestRate),numberOfPayments) - 1));

        return balance;
    }

    public double[] getRemainingBalances(){
        double[] balances = new double[getNumberOfPayments()];

        for(short months = 1; months <= balances.length; months++)
            balances[months - 1] = calculateBalance(months);

        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_A_YEAR);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / PERCENTAGE / MONTHS_IN_A_YEAR;
    }
}
