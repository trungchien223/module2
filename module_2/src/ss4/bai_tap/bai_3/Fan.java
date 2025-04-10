package ss4.bai_tap.bai_3;

public class Fan {
    private int speed = 1;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan dang bat: | Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan dang tat: | Color: " + color + ", Radius: " + radius;
        }
    }
}
