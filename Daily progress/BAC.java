import java.util.Scanner;

public class BAC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double salary;
        double amount;
        int choice;

        do {
            System.out.println("\nbank Services   ");
            System.out.println("1. Check Balance");
            System.out.println("2. Credit Salary");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter your salary: ");
                    salary = sc.nextDouble();

                    balance = balance + salary;

                    System.out.println("Salary credited successfully!");
                    System.out.println("New Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();

                    balance = balance + amount;

                    System.out.println("Amount deposited successfully!");
                    System.out.println("New Balance: " + balance);
                    break;

                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;

                        System.out.println("Amount withdraw successfully!");
                        System.out.println(" Balance:" + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our services!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
