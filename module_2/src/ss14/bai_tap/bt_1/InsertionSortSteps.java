package ss14.bai_tap.bt_1;

import java.util.Scanner;

public class InsertionSortSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap phan tu");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau");
        displayArray(array);
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int currentElement = array[i];
            int position = i;
            System.out.println("Bước " + i + ":");
            System.out.println("- Phần tử cần chèn: " + currentElement);

            while (position > 0 && array[position - 1] > currentElement) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = currentElement;
            System.out.println("- Mảng sau khi chèn:");
            displayArray(array);
        }
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
