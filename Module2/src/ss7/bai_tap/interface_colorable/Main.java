package ss7.bai_tap.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(2, 5) {
        };
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}