package ss6.bai_tap.circle_cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3);
        System.out.println(cylinder);

        cylinder = new Cylinder(5, 2, "black");
        System.out.println(cylinder.toString());
    }
}
