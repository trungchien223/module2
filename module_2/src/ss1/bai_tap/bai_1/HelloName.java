package ss1.bai_tap.bai_1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
