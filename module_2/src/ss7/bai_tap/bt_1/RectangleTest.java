package ss7.bai_tap.bt_1;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Random random = new Random();
        double percent = 1 + random.nextInt(100);

        System.out.println("resize truoc:");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        rectangle.resize(percent);
        System.out.println("resize sau " + percent + "%");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
    }
}
