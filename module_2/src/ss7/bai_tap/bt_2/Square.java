package ss7.bai_tap.bt_2;

import ss7.bai_tap.bt_2.Shape;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side=" + side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
