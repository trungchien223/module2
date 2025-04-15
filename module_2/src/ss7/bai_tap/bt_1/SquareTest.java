package ss7.bai_tap.bt_1;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(3.0);
        Random random = new Random();
        double percent = 1 + random.nextInt(100);
        System.out.println("resize sau:");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        square.resize(percent);
        System.out.println("resize truoc " + percent + "%");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
    }
}
