package ss6.bt_2;

public class TextPoint3D {
    public static void main(String[] args) {
        Poin3D p1 = new Poin3D();
        System.out.println("mac dinh" + p1);
        Poin3D p2 = new Poin3D(10.0f, 32.0f, 45.0f);
        System.out.println("gia tri khi khoi tao" + p2);
        p2.setZ(43.0f);
        System.out.println("gia tri dau khi setZ" + p2);
        p2.setXYZ(6.0f, 3.0f, 8.0f);
        System.out.println("gia tri sau khi setXYZ" + p2);
        float[] xyz = p2.getXYZ();
        System.out.println(xyz[0] + " " + xyz[1] + " " + xyz[2]);
    }
}
