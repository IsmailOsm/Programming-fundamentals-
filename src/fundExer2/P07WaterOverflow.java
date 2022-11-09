package fundExer2;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (totalLiters + liters > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            totalLiters += liters;
        }
        System.out.println(totalLiters);
    }
}
