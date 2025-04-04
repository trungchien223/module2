package ss1.bai_tap.bai_2;

import java.util.Scanner;

public class CurrencyConversionDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int choice;
        do {
            System.out.println("Choose conversion direction:");
            System.out.println("1. USD to VND");
            System.out.println("2. VND to USD");
            System.out.print("Enter your choice (1 or 2): ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter USD: ");
                double usd = scanner.nextDouble();
                double vnd = rate * usd;
                System.out.println(vnd);
            } else if (choice == 2) {
                System.out.print("Enter VND: ");
                double vnd = scanner.nextDouble();
                double usd = vnd / rate;
                System.out.println(usd);
            } else {
                System.out.println("Invalid choice: Please enter 1 or 2.");
            }

        } while (choice != 1 && choice != 2);
    }
}
