package ss7.bai_tap.bt_1;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Random random = new Random();
        double percent = 1 + random.nextInt(100);
        System.out.println("resize truoc");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        circle.resize(percent);
        System.out.println("resize sau " + percent + "%");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
    }
}