package fundExer2;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        while (number > 0) {
            int currentNumber = number % 10;
            sumOfDigits+=currentNumber;
            number = number/10;
        }
        System.out.println(sumOfDigits);
    }
}
