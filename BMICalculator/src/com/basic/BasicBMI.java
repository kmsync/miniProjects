package com.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicBMI {

    //Write a Java program to calculate body mass index (BMI)
    //BMI value is displayed on the screen with a single digit after the decimal point
    //result = weight / (height * height);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight information: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height: ");
        double size = scanner.nextDouble();

        double bmi = weight / (size * size);

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(df.format(bmi));
    }
}