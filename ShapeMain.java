//15 java

import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

// ---------------- TwoDimensional ----------------

abstract class TwoDim extends Shape { }

class Square extends TwoDim {
    double side;

    Square(double s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class Triangle extends TwoDim {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

// ---------------- ThreeDimensional ----------------

abstract class ThreeDim extends Shape { }

class Sphere extends ThreeDim {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Surface Area of Sphere = " + (4 * 3.14159 * radius * radius));
    }
}

class Cube extends ThreeDim {
    double side;

    Cube(double s) {
        side = s;
    }

    void area() {
        System.out.println("Surface Area of Cube = " + (6 * side * side));
    }
}

// ---------------- Main Class ----------------

public class ShapeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        Shape sq = new Square(s);
        sq.area();

        System.out.print("\nEnter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Shape tr = new Triangle(b, h);
        tr.area();

        System.out.print("\nEnter radius of sphere: ");
        double r = sc.nextDouble();
        Shape sp = new Sphere(r);
        sp.area();

        System.out.print("\nEnter side of cube: ");
        double c = sc.nextDouble();
        Shape cu = new Cube(c);
        cu.area();
    }
}
