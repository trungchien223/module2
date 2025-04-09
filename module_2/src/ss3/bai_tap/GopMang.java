package ss3.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.print("Nhập số phần tử của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
