//17
class Even implements Runnable {
    int limit;
    Even(int l) { limit = l; }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= limit; i += 2)
            System.out.print(i + " ");
        System.out.println();
    }
}

class Odd implements Runnable {
    int limit;
    Odd(int l) { limit = l; }

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= limit; i += 2)
            System.out.print(i + " ");
        System.out.println();
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        int limit = 20;
        Thread t1 = new Thread(new Even(limit));
        Thread t2 = new Thread(new Odd(limit));

        t1.start();
        t2.start();
    }
}
