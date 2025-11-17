//17

import java.util.Scanner;

class EvenNumbers implements Runnable {
    int limit;

    EvenNumbers(int l) {
        limit = l;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddNumbers implements Runnable {
    int limit;

    OddNumbers(int l) {
        limit = l;
    }

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class OddEvenThreadMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        // Create Runnable objects
        EvenNumbers even = new EvenNumbers(limit);
        OddNumbers odd = new OddNumbers(limit);

        // Convert Runnable to Thread
        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        // Start both threads
        t1.start();
        t2.start();
    }
}
