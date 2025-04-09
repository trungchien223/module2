package ss3.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang:");
        int rows = scanner.nextInt();
        System.out.println("nhap so cot:");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("nhap phan tu[" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mang 2 chieu vua nhap:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("nhap cot can tinh tong:");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        System.out.println("Tổng số cột : " + col + " là: " + sum);
    }
}
