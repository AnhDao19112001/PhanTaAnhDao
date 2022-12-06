package ss4.bai_tap.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double numberA = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double numberB = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double numberC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.viewResult());
    }
}
