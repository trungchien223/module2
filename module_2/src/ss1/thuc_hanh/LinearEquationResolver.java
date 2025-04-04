package ss1.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println(name);
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = " + answer);
        } else {
            if (b == c) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
