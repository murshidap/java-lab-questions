public class Cube {
    double side;

    public Cube(double s) {
        side = s;
    }

    public double volume() {
        return side * side * side;
    }
}
