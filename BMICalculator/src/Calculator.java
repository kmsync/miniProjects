import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("---BMI Calculator");

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double result;

        System.out.println("Enter your weight?");
        weight = scanner.nextDouble();
        System.out.println("Enter your height?");
        height = scanner.nextDouble();
        //result = weight / (height * height);
        result = weight / Math.pow(height, 2);

        String preStr = "You are ";
        if (result < 18.5) {
            System.out.println(preStr + "UNDERWEIGHT");
        } else if (result >= 18.5 && result < 25.0) {
            System.out.println(preStr + "NORMAL");
        } else if (result >= 25.0 && result < 30.0) {
            System.out.println(preStr + "OVERWEIGHT");
        } else if (result >= 30) {
            System.out.println(preStr + "VERY OVERWEIGHT");
        }
    }
}