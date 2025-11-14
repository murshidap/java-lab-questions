public class Sphere {
    double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
