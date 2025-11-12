class ObjCount {
    static int count = 0;

    ObjCount() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }

    public static void main(String[] args) {
        ObjCount o1 = new ObjCount();
        ObjCount o2 = new ObjCount();
        ObjCount o3 = new ObjCount();
        ObjCount.displayCount();
    }
}
