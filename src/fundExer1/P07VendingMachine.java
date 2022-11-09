package fundExer1;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoney = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins != 1 && coins != 2 && coins != 0.5 && coins != 0.2 && coins != 0.1) {
                System.out.printf("Cannot accept %.2f%n", coins);
                input = scanner.nextLine();
                continue;
            }
            totalMoney += coins;
            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            String product = input2;
            switch (product) {
                case "Nuts":
                    if (totalMoney < 2.0){
                        System.out.println("Sorry, not enough money");
                        input2 = scanner.nextLine();
                        continue;
                    }
                        totalMoney -= 2.0;
                    break;
                case "Water":
                    if (totalMoney < 0.7){
                        System.out.println("Sorry, not enough money");
                        input2 = scanner.nextLine();
                        continue;
                    }
                    totalMoney -= 0.7;
                    break;
                case "Crisps":
                    if (totalMoney < 1.5){
                        System.out.println("Sorry, not enough money");
                        input2 = scanner.nextLine();
                        continue;
                    }
                    totalMoney -= 1.5;
                    break;
                case "Soda":
                    if (totalMoney < 0.8){
                        System.out.println("Sorry, not enough money");
                        input2 = scanner.nextLine();
                        continue;
                    }
                    totalMoney -= 0.8;
                    break;
                case "Coke":
                    if (totalMoney < 1.0){
                        System.out.println("Sorry, not enough money");
                        input2 = scanner.nextLine();
                        continue;
                    }
                    totalMoney -= 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    input2 = scanner.nextLine();
                    continue;
            }
            System.out.printf("Purchased %s%n", product);

            input2 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
