import java.util.Scanner;

class BankAccount {
    String ac_name;
    long ac_number;
    double ac_balance;
    static Scanner scanner = new Scanner(System.in);

    BankAccount(String name, long an) {
        ac_name = name;
        ac_number = an;
        ac_balance = 0;
    }

    void deposit() {
        System.out.print("Enter Amount for deposit: ");
        int deposit_amount = scanner.nextInt();
        ac_balance += deposit_amount;
        System.out.println("Deposit Successful");
    }

    void view_balance() {
        System.out.println("Ac balance is: " + ac_balance);
    }

    void withdraw(int wa) {
        if (wa <= ac_balance) {
            ac_balance -= wa;
        } else {
            System.out.println("Your Account balance is: " + ac_balance + "\nWithdraw is not possible");
        }
    }

    void display() {
        System.out.println("-----Account Info-----");
        System.out.println("Ac Name: " + ac_name);
        System.out.println("Ac No: " + ac_number);
        System.out.println("Ac balance: " + ac_balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, long an) {
        super(name, an);
    }

    @Override
    void withdraw(int wa) {
        if (wa <= ac_balance && ac_balance - wa >= 100) {
            ac_balance -= wa;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Your Account balance is: " + ac_balance + ". Account balance must not fall below 100.\nWithdraw is not possible.");
        }
    }
}

public class Bankop {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("XYZ", 412412341234L);

        System.out.println("\t\tWelcome to Bank Application");
        System.out.println("Ac balance is zero. Deposit first.");
        sa.deposit();

        while (true) {
            System.out.println("1-> Show Ac info\n2-> Deposit\n3-> Withdraw\n4-> Show balance\n5-> Exit");
            System.out.print("Enter operation no: ");
            int op = BankAccount.scanner.nextInt();

            switch (op) {
                case 1:
                    sa.display();
                    break;

                case 2:
                    sa.deposit();
                    break;

                case 3:
                    System.out.print("Enter amount for withdrawal: ");
                    int w = BankAccount.scanner.nextInt();
                    sa.withdraw(w);
                    break;

                case 4:
                    sa.view_balance();
                    break;

                case 5:
                    System.out.println("PROGRAM TERMINATED SUCCESSFULLY");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}
