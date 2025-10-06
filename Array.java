import java.util.Scanner;

class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (at least 10): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int sm = arr[0];
        int lrg = arr[0];
        int secLrg = arr[0];

        for (int i = 1; i < n; i++) 
        {
            if (arr[i] < sm) 
            {
                sm = arr[i];
            }
            if (arr[i] > lrg) 
            {
                secLrg = lrg;
                lrg = arr[i];
            }
        }
        System.out.println("Smallest element: " + sm);
        System.out.println("Largest element: " + lrg);
        System.out.println("Second largest element: " + secLrg);
    }
}
