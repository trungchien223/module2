package ss6.bt_3;

import ss6.bt_2.Point2D;

public class TextPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println("mac dinh" + p1);
        Point2D p2 = new Point2D(3f, 5f);
        System.out.println(p2 + "sau khi them gia tri");
        p2.setX(5f);
        p2.setY(7f);
        System.out.println(p2 + "sau khi setX setY");
        p2.setXY(9f, 10f);
        System.out.println("sau khi setXY" + p2);
        float[] xy = p2.getXY();
        System.out.println("gia tri cua getXY la:" + xy[0] + xy[1]);
    }
}
