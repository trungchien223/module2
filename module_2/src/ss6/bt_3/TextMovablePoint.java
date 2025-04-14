package ss6.bt_3;

public class TextMovablePoint {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Point: " + p);

        MovablePoint mp = new MovablePoint(5, 6, 1, 1);
        System.out.println("Before move: " + mp);

        mp.move();
        System.out.println("After move: " + mp);
    }
}
