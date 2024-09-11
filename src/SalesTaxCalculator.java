import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceOfPurchase;
        double totalPrice;
        double TAX = 0.05;

        System.out.println("Enter the price of your purchase:");
        priceOfPurchase = scan.nextDouble();

        totalPrice = priceOfPurchase * TAX;

        System.out.println("The total price of your purchase is $" + totalPrice + " including tax.");
    }
}