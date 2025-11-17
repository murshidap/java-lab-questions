//18

import java.util.Scanner;

class MinBalExp extends Exception {
    MinBalExp(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    Account(double bal) {
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) throws MinBalExp {
        if (amt > balance)
            throw new MinBalExp("Withdrawal amount greater than Balance!");
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }

    void display() {
        System.out.println("Current Balance = " + balance);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account obj = new Account(1000);

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter amount: ");
                obj.deposit(sc.nextDouble());
            } 
            else if (ch == 2) {
                System.out.print("Enter amount: ");
                try {
                    obj.withdraw(sc.nextDouble());
                } catch (MinBalExp e) {
                    System.out.println(e.getMessage());
                }
            } 
            else break;

            obj.display();
        }
    }
}
