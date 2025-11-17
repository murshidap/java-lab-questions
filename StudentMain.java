//11

import java.util.Scanner;

class Student {
    String name;
    int roll;

    void readStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

class Mark extends Student {
    int m[] = new int[5];
    int total = 0;
    double avg;

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
            total += m[i];
        }
        avg = total / 5.0;
    }

    void displayResult() {
        displayStudent();
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + avg);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Mark obj = new Mark();
        obj.readStudent();
        obj.readMarks();
        obj.displayResult();
    }
}
