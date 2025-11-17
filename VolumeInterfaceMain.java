//16

import java.util.*;

interface Volume {
    double pi = 3.14;
    void readData();
    void dispVolume();
}

class Sphere implements Volume {
    double r, vol;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        r = sc.nextDouble();
    }

    public void dispVolume() {
        vol = (4/3.0) * pi * r * r * r;
        System.out.println("Volume of Sphere = " + vol);
    }
}

class Cylinder implements Volume {
    double r, h, vol;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        r = sc.nextDouble();
        System.out.print("Enter Height: ");
        h = sc.nextDouble();
    }

    public void dispVolume() {
        vol = pi * r * r * h;
        System.out.println("Volume of Cylinder = " + vol);
    }
}

public class VolumeInterfaceMain {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.readData();
        s.dispVolume();

        Cylinder c = new Cylinder();
        c.readData();
        c.dispVolume();
    }
}
