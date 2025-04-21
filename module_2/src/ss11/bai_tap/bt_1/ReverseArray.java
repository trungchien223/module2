package ss11.bai_tap.bt_1;

import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Trước khi đảo:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        reverseArray(array);
        System.out.println("\nSau khi đảo:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
