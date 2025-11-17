//14

class Volume {
    double findVolume(double a) {
        return a * a * a;               // Cube
    }

    double findVolume(double l, double b, double h) {
        return l * b * h;               // Rectangular box
    }

    double findVolume(double r, double h) {
        return 3.14 * r * r * h;        // Cylinder
    }
}

public class VolumeMain {
    public static void main(String[] args) {
        Volume v = new Volume();

        System.out.println("Cube Volume = " + v.findVolume(5));
        System.out.println("Rectangular Box Volume = " + v.findVolume(4, 5, 6));
        System.out.println("Cylinder Volume = " + v.findVolume(2.5, 10));
    }
}
