package com.dolarLirasConverter;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Converter {
    public static void main(String[] args) {
        String test = "Test";
        double dollarAmount = 125.5;
        double liraAmount = dollarAmount * 26.9679;
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println(dollarAmount + " US Dollars equal to : " + formatter.format(liraAmount) + " TL");
    }
}