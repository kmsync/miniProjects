import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


// Annual interest calculation
public class Calculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter annual interest: ");
        double interest = scanner.nextDouble();

        System.out.println("How many years of interest do you want to calculate? : ");
        int duration = scanner.nextInt();

        System.out.println("Enter the capital amount: ");
        int capital = scanner.nextInt();

        double result = capital * Math.pow((1 + (interest / 100)), duration);

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(result));
    }
}