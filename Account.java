import java.util.Scanner;

class Account {
    String name;
    int accNo;
    double balance;

    Account(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Account a = new Account(name, accNo, bal);

        int choice;

        // Loop until cancel
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Cancel");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    a.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    a.withdraw(wd);
                    break;

                case 3:
                    System.out.println("Exiting transaction...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        a.display();
    }
}
