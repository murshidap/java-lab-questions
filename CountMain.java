//13

class CountObj {
    static int count = 0;

    CountObj() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects created = " + count);
    }
}

public class CountMain {
    public static void main(String[] args) {
        new CountObj();
        new CountObj();
        new CountObj();

        CountObj.displayCount();
    }
}
