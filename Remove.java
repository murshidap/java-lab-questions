//8
import java.util.Scanner;

class Remove 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replaceAll("[AEIOUaeiou]", "");

        System.out.println("String after removing vowels: " + result);
    }
}
