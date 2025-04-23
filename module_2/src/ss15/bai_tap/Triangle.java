package ss15.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cac canh phai la so duong");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("tong 2 canh khong dc nho hon canh con lai");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println("canh a la: " + a);
        System.out.println("canh b la: " + b);
        System.out.println("canh c la: " + c);
    }

}
