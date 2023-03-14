package ss6.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + '\'' +
                "area=" + getArea() +
                '}';
    }
}
