public class RectBox {
    double l, b, h;

    public RectBox(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public double volume() {
        return l * b * h;
    }
}
