package ss1.bai_tap.bai_3;

import java.util.Scanner;

public class ReadingNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int num = scanner.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Number is invalid");
            return;
        }
    }
}
