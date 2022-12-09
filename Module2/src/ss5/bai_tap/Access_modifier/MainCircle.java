package ss5.bai_tap.Access_modifier;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("CIRCLE 1:\n" + circle1);

        Circle circle2 = new Circle(3, "blue");
        System.out.println("CIRCLE 2:\n" + circle2);
    }
}
