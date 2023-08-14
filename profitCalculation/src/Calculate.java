import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate {

    // We know that the selling price of a product includes 18% VAT and 25% profit.
    // Calculate the raw price of the product.
    // Calculate the profit of the product.

    public static void main(String[] args) {

        // Selling Price * 100) / (100 + 18) -> Price without VAT
        // Price without VAT * 100) / (100 + 25) -> Raw Price

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the selling price includes VAT: ");

        double sellingPrice = scanner.nextInt();
        int sellingLast = (int) Math.round(sellingPrice);

        double priceWithoutVAT = (sellingPrice * 100) / (100 + 18);
        int withoutVATLast = (int) Math.round(priceWithoutVAT);

        double rawPrice = (priceWithoutVAT * 100) / (100 + 25);
        int rawPriceLast = (int) Math.round(rawPrice);

        double profit = (priceWithoutVAT - rawPriceLast);
        int profitLast = (int) Math.round(profit);

        double VAT = (sellingPrice - priceWithoutVAT);
        int VATlast = (int) Math.round(VAT);

        System.out.println("\nRaw Price: " + rawPrice);
        System.out.println("Profit: " + profit);
        System.out.println("VAT: " + VAT);
        System.out.println("Selling Price without VAT: " + priceWithoutVAT);
        System.out.println("Selling Price with VAT: " + sellingPrice);

        System.out.println("\n***************************");

        System.out.println("\nApproximately");

        DecimalFormat df = new DecimalFormat("0.000");

        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\nRaw Price: " + df.format(rawPrice));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Profit: " + df.format(profit));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("VAT: " + df.format(VAT));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Selling Price without VAT: " + df.format(priceWithoutVAT));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Selling Price with VAT: " + df.format(sellingPrice));

        System.out.println("\n***************************");

        System.out.println("\nApproximatelyV2");

        System.out.println("\nRaw Price: " + rawPriceLast);
        System.out.println("Profit: " + profitLast);
        System.out.println("VAT: " + VATlast);
        System.out.println("Selling Price without VAT: " + withoutVATLast);
        System.out.println("Selling Price with VAT: " + sellingLast);
    }
}