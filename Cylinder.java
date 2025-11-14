public class Cylinder {
    double r, h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double volume() {
        return Math.PI * r * r * h;
    }
}
