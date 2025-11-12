class VolumeCalculator {
    double volume(double side) {
        return side * side * side; // cube
    }

    double volume(double l, double b, double h) {
        return l * b * h; // rectangular box
    }

    double volume(double r, double h) {
        return 3.14159 * r * r * h; // cylinder
    }

    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();
        System.out.println("Volume of Cube: " + v.volume(3));
        System.out.println("Volume of Box: " + v.volume(2, 3, 4));
        System.out.println("Volume of Cylinder: " + v.volume(2, 5));
    }
}
