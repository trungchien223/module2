package ss3.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap phan tu can xoa:");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phan tu " + x + " khong ton tai trong mang");
        } else {
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("mang sau khi xoa phan tu " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
}
