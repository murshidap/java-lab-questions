import java.util.Scanner;

class Complex {
    int real, imag;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    Complex add(Complex c2) {
        Complex result = new Complex();
        result.real = this.real + c2.real;
        result.imag = this.imag + c2.imag;
        return result;
    }

    void display() {
        System.out.println("Sum = " + real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.read();
        System.out.println("Enter second complex number:");
        c2.read();

        Complex sum = c1.add(c2);
        sum.display();
    }
}
