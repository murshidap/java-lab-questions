import java.util.Scanner;

class Student {
    String name;
    int roll;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Mark extends Student {
    int[] marks = new int[5];
    int total = 0;
    double average;

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
    }

    void displayResult() {
        displayData();
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Mark m = new Mark();
        m.readData();
        m.readMarks();
        m.displayResult();
    }
}
