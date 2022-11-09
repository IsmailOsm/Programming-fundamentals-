package fundExer1;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";
        int counter = 0;
        for (int i = userName.length() - 1; i >= 0; i--) {
            char symbol = userName.charAt(i);
            password += symbol;
        }
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            counter++;
            if (counter==4){
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }if (counter==4){
            System.out.printf("User %s blocked!", userName);
        }else {
            System.out.printf("User %s logged in.",userName);
        }

    }
}
