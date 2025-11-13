//18
import java.util.Scanner;

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

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) throws MinBalExp {
        if (amt > balance)
            throw new MinBalExp("Insufficient Balance!");
        else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account("John", 1001, 5000);
        a1.display();

        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        try {
            a1.withdraw(amt);
        } catch (MinBalExp e) {
            System.out.println("Exception: " + e.getMessage());
        }

        a1.display();
    }
}
