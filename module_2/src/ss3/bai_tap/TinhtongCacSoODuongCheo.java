package ss3.bai_tap;

import java.util.Scanner;

public class TinhtongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập kích thước ma trận vuông (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Kích thước không hợp lệ");
            }
        } while (n <= 0);
        int[][] matrix = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang 2 chieu vua nhap:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("tong cac duong cheo chinh " + sum);
    }
}
