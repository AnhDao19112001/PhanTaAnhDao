package ss4;

public class QuadraticEquation {
    int a;
    int b;
    int c;
    double delta;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }

    public double getRoot1(double delta) {
        this.delta = delta;
        return (-this.b) + Math.sqrt(delta) / 2 * this.a;
    }

    public double getRoot2(double delta) {
        this.delta = delta;
        return (-this.b) - Math.sqrt(delta) / 2 * this.a;
    }
}
