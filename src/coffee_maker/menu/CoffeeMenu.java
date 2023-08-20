package coffee_maker.menu;

import java.util.Scanner;

public class CoffeeMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static int showMenuAndGetChoice() {
        System.out.println("Choose a drink:");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Latte");

        int choice = -1;
        while (choice < 1 || choice > 3) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        return choice;
    }
}
