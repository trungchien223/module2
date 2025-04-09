package ss3.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap phan tu can them:");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri can them:");
        int index = scanner.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Khong the chen phan tu:");
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            n++;
        }
        System.out.println("Mảng sau khi chèn phần tử " + x + " vào vị trí " + index + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
