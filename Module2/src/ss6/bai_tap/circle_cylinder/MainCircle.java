package ss6.bai_tap.circle_cylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2, "red");
        System.out.println(circle.toString());
        System.out.println(circle);
    }
}