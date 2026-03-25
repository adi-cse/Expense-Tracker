import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseService service = new ExpenseService();

        // load old data
        service.setTransactions(FileHandler.load());

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double inc = sc.nextDouble();
                    service.addIncome(inc);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double exp = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    service.addExpense(exp, cat);
                    break;

                case 3:
                    service.showAll();
                    break;

                case 4:
                    service.showBalance();
                    break;

                case 5:
                    FileHandler.save(service.getTransactions());
                    System.out.println("Data saved. Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
