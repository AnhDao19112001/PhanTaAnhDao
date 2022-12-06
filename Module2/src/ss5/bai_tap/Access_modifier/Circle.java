package ss5.bai_tap.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return String.format("radius: %1.2f, area: %1.2f, color: %s.", getRadius(), getArea(), getColor());
    }
}
