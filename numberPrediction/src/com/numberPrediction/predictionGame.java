package com.numberPrediction;

import java.util.Random;
import java.util.Scanner;

public class predictionGame {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        int input;
        int counter = 0;

        while (true) {
            counter++;
            System.out.println("Please enter your guess: ");
            input = scanner.nextInt();

            if (input == randomNumber) {
                System.out.println("Congratulations.. You got it on the " + counter + ". try!");
                break;
            } else if (input < randomNumber) {
                System.out.println("Please enter a larger value!!");
            } else if (input > randomNumber) {
                System.out.println("Please enter a smaller value!!");
            }
        }
        scanner.close();
    }
}