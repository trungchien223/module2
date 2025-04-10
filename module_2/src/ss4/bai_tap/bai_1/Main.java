package ss4.bai_tap.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("pt co 2 nghiem la: " + quadraticEquation.getRoot1() + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("pt co 1 nghiem: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("pt vo nghiem");
        }
    }
}
