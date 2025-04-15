package ss7.bai_tap.bt_1;

public class Square extends Shape implements Resizeable {
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
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "A Square with side=" + side;
    }
}
