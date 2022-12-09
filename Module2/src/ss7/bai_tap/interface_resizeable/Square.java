package ss7.bai_tap.interface_resizeable;

public class Square extends Shape {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }
}
