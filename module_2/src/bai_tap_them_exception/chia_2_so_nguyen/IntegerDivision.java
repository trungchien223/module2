package bai_tap_them_exception.chia_2_so_nguyen;

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap b");
            int b = Integer.parseInt(scanner.nextLine());
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("loi~: khong the chia cho 0");
        } catch (Exception e) {
            System.out.println("loi~");
        } finally {
            scanner.close();
        }
    }
}
