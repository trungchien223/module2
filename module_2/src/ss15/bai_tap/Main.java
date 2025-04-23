package ss15.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap c");
            int c = Integer.parseInt(scanner.nextLine());
            Triangle triangle = new Triangle(a, b, c);
            triangle.display();
        } catch (IllegalTriangleException e) {
            System.out.println("loi~\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("loi~");
        }
    }
}
