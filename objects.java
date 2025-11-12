class Counter {
  
     Counter() {
        count++;
    }
    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }
}

public class ObjectCountDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Counter.displayCount();  
        Counter c3 = new Counter();
        Counter.displayCount();     
 }
}
