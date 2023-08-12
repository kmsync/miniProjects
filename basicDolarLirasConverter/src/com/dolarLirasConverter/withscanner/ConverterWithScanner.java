package com.dolarLirasConverter.withscanner;

import java.util.Scanner;

public class ConverterWithScanner {

    public static void main(String[] args) {

        System.out.println("How many dollar do you have?");
        Scanner scanner = new Scanner(System.in);
        double dollarAmount = scanner.nextDouble();

        double turkishLiraValue = 26.9679;

        System.out.println(dollarAmount + "$ equals to " + dollarAmount * turkishLiraValue + "₺");
    }
}