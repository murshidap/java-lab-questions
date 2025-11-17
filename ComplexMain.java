//12

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 6);

        Complex sum = c1.add(c2);

        System.out.print("Sum = ");
        sum.display();
    }
}
