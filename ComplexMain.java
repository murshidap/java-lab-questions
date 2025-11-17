//12 
import java.util.Scanner;

class Complex {
    int real, imag;

    // Method to read a complex number
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    // Method that accepts an object as parameter
    Complex add(Complex c) {
        Complex result = new Complex();   // New object to store result
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    // To display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexMain {
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter First Complex Number:");
        c1.read();

        System.out.println("Enter Second Complex Number:");
        c2.read();

        // Passing object c2 as parameter to c1.add()
        Complex sum = c1.add(c2);

        System.out.println("\nFirst Number:");
        c1.display();

        System.out.println("Second Number:");
        c2.display();

        System.out.println("\nSum of the Two Complex Numbers:");
        sum.display();
    }
}
