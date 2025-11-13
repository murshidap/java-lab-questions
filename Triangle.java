//2
import java.util.Scanner;

class Triangle 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) 
        {
            if (a == b && b == c) 
            {
                System.out.println("It is Equilateral.");
            } 
            else if (a == b || b == c || a == c) 
            {
                System.out.println("It is Isosceles.");
            } 
            else 
            {
                System.out.println("It is Scalene.");
            }
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of the triangle: " + area);
        } 
        else 
        {
            System.out.println("It  is not a triangle");
        }
    }
}
