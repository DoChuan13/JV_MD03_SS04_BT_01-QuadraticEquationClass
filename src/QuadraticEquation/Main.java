package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation...");
        double a, b, c;
        do {
            System.out.print("Enter a: ");
            a = input.nextDouble();
            if (a == 0) {
                System.out.println("Please enter a different 0!!!");
            }
        } while (a == 0);
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        if (delta < 0) {
            System.out.println("The equation has no real root");
        } else if (delta == 0) {
            System.out.printf("The equation has one root is %f", root1);
        } else {
            System.out.printf("The equation has two roots is %f and %f", root1, root2);
        }
    }
}
