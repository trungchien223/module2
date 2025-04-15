package ss7.bai_tap.bt_2;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(5.0);
        squares[1] = new Square(3.5);
        for (Square square : squares) {
            System.out.println(square);
            System.out.println("Area: " + square.getArea());
            square.howToColor();
        }
    }
}
