package bai_tap_them_exception.tinh_can_bac_hai;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap so");
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 0) {
                throw new NegativeNumberException("so am khong the can bac 2");
            }
            System.out.println(num + "=" + Math.sqrt(num));
        } catch (NegativeNumberException e) {
            System.out.println("loi~: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("loi~: vui long nhap so thuc");
        }
    }
}
