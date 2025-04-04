package ss1.bai_tap.bai_2;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Choose conversion direction:");
        System.out.println("1.USD to VND");
        System.out.println("2.VND to USD");
        System.out.print("Enter your choice:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter USD:");
            double usd = scanner.nextInt();
            double vnd = rate * usd;
            System.out.println(vnd);
        } else if (choice == 2) {
            System.out.println("Enter VND:");
            double vnd = scanner.nextInt();
            double usd = vnd / rate;
            System.out.println(usd);
        } else {
            System.out.println("chon 1 trong 2");
        }
    }
}
