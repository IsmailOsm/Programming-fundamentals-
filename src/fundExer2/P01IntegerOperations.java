package fundExer2;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int sum = numberOne + numberTwo;
        int numberThree = Integer.parseInt(scanner.nextLine());
        int division = sum / numberThree;
        int numberFour = Integer.parseInt(scanner.nextLine());
        int multiplication = division * numberFour;
        System.out.println(multiplication);

    }
}