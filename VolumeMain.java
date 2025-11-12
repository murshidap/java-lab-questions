import java.util.Scanner;

interface Volume {
    double pi = 3.14159;
    void readData();
    void dispVolume();
}

class Sphere implements Volume {
    double r, v;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        r = sc.nextDouble();
    }

    public void dispVolume() {
        v = (4 / 3.0) * pi * r * r * r;
        System.out.println("Volume of Sphere: " + v);
    }
}

class Cylinder implements Volume {
    double r, h, v;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of cylinder: ");
        r = sc.nextDouble();
        h = sc.nextDouble();
    }

    public void dispVolume() {
        v = pi * r * r * h;
        System.out.println("Volume of Cylinder: " + v);
    }
}

public class VolumeMain {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.readData();
        s.dispVolume();

        Cylinder c = new Cylinder();
        c.readData();
        c.dispVolume();
    }
}
