//14 java

import java.util.Scanner;

class Volume {

    // Volume of Cube: side³
    double findVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Box: l × b × h
    double findVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    // Volume of Cylinder: π r² h
    double findVolume(double radius, int height) {
        return 3.14159 * radius * radius * height;
    }
}

public class VolumeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube = " + v.findVolume(side));

        System.out.print("\nEnter length, breadth and height of rectangular box: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Box = " + v.findVolume(l, b, h));

        System.out.print("\nEnter radius and height of cylinder: ");
        double r = sc.nextDouble();
        int hCyl = sc.nextInt();
        System.out.println("Volume of Cylinder = " + v.findVolume(r, hCyl));
    }
}
