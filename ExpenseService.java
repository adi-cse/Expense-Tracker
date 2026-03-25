import java.util.*;

public class ExpenseService {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addIncome(double amount) {
        transactions.add(new Transaction(amount, "General", "income"));
    }

    public void addExpense(double amount, String category) {
        transactions.add(new Transaction(amount, category, "expense"));
    }

    public void showAll() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public void showBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t.type.equals("income")) balance += t.amount;
            else balance -= t.amount;
        }
        System.out.println("Current Balance: ₹" + balance);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> list) {
        this.transactions = list;
    }
}
