package bai_tap_them_exception.chuyen_chuoi_thanh_so;

import java.util.Scanner;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Giá trị số nguyên: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: '" + input + "' không phải là số nguyên.");
        } finally {
            scanner.close();
        }
    }
}
