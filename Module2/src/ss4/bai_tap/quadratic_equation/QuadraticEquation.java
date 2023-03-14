package ss4.bai_tap.quadratic_equation;

public class QuadraticEquation {
    double numberA;
    double numberB;
    double numberC;

    QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA() {
        return this.numberA;
    }

    public double getNumberB() {
        return this.numberB;
    }

    public double getNumberC() {
        return this.numberC;
    }

    public String display() {
        return "Phương trình bậc 2: " + getNumberA() + "*X^2 + " + getNumberB() + "*X + " + getNumberC() + " = 0";
    }

    public double getDelta() {
        return getNumberB() * getNumberB() - 4 * getNumberA() * getNumberC();
    }

    public double getRoot1() {
        return (-getNumberB() + Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public double getRoot2() {
        return (-getNumberB() - Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public String viewResult() {
        if (getDelta() < 0) {
            return "Phương trình vô nghiệm!";
        }

        if (getDelta() == 0) {
            return "Phương trình có nghiệm kép: X1 = X2 = " + getRoot1();
        }

        return "Phương trình có 2 nghiệm phân biệt: X1 = " + getRoot1() + " and X2 = " + getRoot2();
    }
}
