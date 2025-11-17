//15

abstract class Shape {}

abstract class TwoDim extends Shape {
    abstract void area();
}

abstract class ThreeDim extends Shape {
    abstract void area();
}

class Square extends TwoDim {
    double side;

    Square(double s) { side = s; }

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class Triangle extends TwoDim {
    double b, h;

    Triangle(double b, double h) {
        this.b = b; this.h = h;
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}

class Sphere extends ThreeDim {
    double r;

    Sphere(double r) { this.r = r; }

    void area() {
        System.out.println("Area of Sphere = " + (4 * 3.14 * r * r));
    }
}

class Cube extends ThreeDim {
    double a;

    Cube(double a) { this.a = a; }

    void area() {
        System.out.println("Area of Cube = " + (6 * a * a));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        new Square(5).area();
        new Triangle(4, 6).area();
        new Sphere(3).area();
        new Cube(4).area();
    }
}
