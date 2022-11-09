package fundExer1;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        double total = 0;
        for (int i = 1; i <= numberOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int amountOfCapsules = Integer.parseInt(scanner.nextLine());
            double price = days * amountOfCapsules * pricePerCapsule;
            total += price;
            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f",total);
    }
}
