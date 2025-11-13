//8
import java.util.Scanner;

class SumRev 
{
    int num;
    SumRev(int n)  
    {
        num = n;
    }
    int DigitSum() 
    {
        int sum = 0, temp = num;
        while (temp > 0) 
        {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    int Rev() 
    {
        int rv = 0, temp = num;
        while (temp > 0) 
        {
            rv = rv * 10 + temp % 10;
            temp /= 10;
        }
        return rv;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        SumRev obj = new SumRev(n);

        System.out.println("Sum of digits: " + obj.DigitSum());
        System.out.println("Reverse of number: " + obj.Rev());
    }
}
