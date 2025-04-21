package ss11.bai_tap.bt_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    private static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        String[] array = str.toLowerCase().split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(" ")) {
                stack.push(array[i]);
                queue.add(array[i]);
            }
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Là chuỗi palindrome");
        } else {
            System.out.println("Không phải chuỗi palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
