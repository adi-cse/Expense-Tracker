import java.io.Serializable;

public class Transaction implements Serializable {
    double amount;
    String category;
    String type; // income / expense

    public Transaction(double amount, String category, String type) {
        this.amount = amount;
        this.category = category;
        this.type = type;
    }

    public String toString() {
        return type.toUpperCase() + " | " + category + " | ₹" + amount;
    }
}
