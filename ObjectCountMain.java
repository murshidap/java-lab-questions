//13 

class CountObjects {
    static int count = 0;   // static variable to count objects

    CountObjects() {
        count++;    // increment when object is created
    }

    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }
}

public class ObjectCountMain {
    public static void main(String[] args) {

        CountObjects o1 = new CountObjects();
        CountObjects o2 = new CountObjects();
        CountObjects o3 = new CountObjects();
        CountObjects o4 = new CountObjects();

        CountObjects.displayCount();
    }
}
