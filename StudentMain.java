//11

import java.util.Scanner;

class Student {
    String name;
    int roll;

    void readStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
    }

    void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Mark extends Student {
    int marks[] = new int[5];
    int total = 0;
    double average;

    void readMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        average = total / 5.0;
    }

    void displayResult() {
        System.out.println("\n--- Marks & Result ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Mark m = new Mark();

        m.readStudent();
        m.readMarks();

        m.displayStudent();
        m.displayResult();
    }
}
