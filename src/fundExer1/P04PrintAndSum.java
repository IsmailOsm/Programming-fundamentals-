package fundExer1;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = firstNumber; i <=lastNumber ; i++) {
            sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
