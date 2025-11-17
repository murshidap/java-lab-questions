//16 java

import java.util.Scanner;

interface Volume {
    double pi = 3.14159;        // interface constant

    void readData();            // abstract method
    void dispVolume();          // abstract method
}

class Sphere implements Volume {
    double radius, volume;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        radius = sc.nextDouble();
    }

    public void dispVolume() {
        volume = (4.0 / 3.0) * pi * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);
    }
}

class Cylinder implements Volume {
    double radius, height, volume;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of Cylinder: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
    }

    public void dispVolume() {
        volume = pi * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}

public class InterfaceVolumeMain {
    public static void main(String[] args) {

        Sphere s = new Sphere();
        s.readData();
        s.dispVolume();

        System.out.println();

        Cylinder c = new Cylinder();
        c.readData();
        c.dispVolume();
    }
}
