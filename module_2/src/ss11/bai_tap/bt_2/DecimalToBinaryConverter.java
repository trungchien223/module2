package ss11.bai_tap.bt_2;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverter {

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        String binary = convertToBinary(decimal);
        System.out.println("Số nhị phân: " + binary);
    }
}
