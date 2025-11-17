//18 

import java.util.Scanner;

// User-defined exception
class MinBalExp extends Exception {
    MinBalExp(String msg) {
        super(msg);
    }
}

class Account {
    String name;
    int accNo;
    double balance;

    Account(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }

    // Deposit money
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw money with custom exception
    void withdraw(double amt) throws MinBalExp {
        if (amt > balance) {
            throw new MinBalExp("Withdrawal Failed! Amount is greater than balance.");
        }
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
        System.out.println("Current Balance: " + balance);
    }
}

public class AccountMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating account
        Account a = new Account("Murshida", 101, 5000);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        try {
            switch (ch) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    a.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    a.withdraw(w);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        catch (MinBalExp e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
