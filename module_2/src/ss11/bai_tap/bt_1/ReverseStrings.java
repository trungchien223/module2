package ss11.bai_tap.bt_1;

import java.util.Stack;

public class ReverseStrings {
    private static void stringArray() {
        Stack<String> stack = new Stack<>();
        System.out.println("Before: ");

        String str = "Một Hai Ba Bốn Năm Sáu Bảy";

        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(" " + strings[i]);
            stack.push(strings[i]);
        }
        System.out.println("\nAfter: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stack.pop();
            System.out.print(" " + strings[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n");
        stringArray();
    }
}
