package fundExer1;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;
        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice = people * 8.45;
                        if (people > 29) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;
                    case "Saturday":
                        totalPrice = people * 9.80;
                        if (people > 29) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;
                    case "Sunday":
                        totalPrice = people * 10.46;
                        if (people > 29) {
                            totalPrice = totalPrice * 0.85;
                        }
                        break;
                    default:
                        break;
                }

                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        totalPrice = people * 10.90;
                        if (people > 99) {
                            totalPrice = totalPrice - (10 * 10.90);
                        }
                        break;
                    case "Saturday":
                        totalPrice = people * 15.60;
                        if (people > 99) {
                            totalPrice = totalPrice - (10 * 15.60);
                        }
                        break;
                    case "Sunday":
                        totalPrice = people * 16;
                        if (people > 99) {
                            totalPrice = totalPrice - (10 * 16);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalPrice = people * 15;
                        if (people > 9 && people < 21) {
                            totalPrice = totalPrice * 0.95;
                        }
                        break;
                    case "Saturday":
                        totalPrice = people * 20;
                        if (people > 9 && people < 21) {
                            totalPrice = totalPrice * 0.95;
                        }
                        break;
                    case "Sunday":
                        totalPrice = people * 22.50;
                        if (people > 9 && people < 21) {
                            totalPrice = totalPrice * 0.95;
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
