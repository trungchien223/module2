package ss6.bt_2;

public class Poin3D extends Point2D {
    private float z = 0.0f;

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Poin3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        setX(x);
        setY(y);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Poin3D{" +
                "z=" + z +
                "x=" + getX() +
                "y" + getY() +
                '}';
    }
}
