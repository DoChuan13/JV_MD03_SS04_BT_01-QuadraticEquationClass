package QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        double x1;
        double delta = getDiscriminant();
        if (delta < 0) {
            return x1 = 0;
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            return x1;
        }
    }

    public double getRoot2() {
        double x2;
        double delta = getDiscriminant();
        if (delta < 0) {
            return x2 = 0;
        } else {
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return x2;
        }
    }
}
