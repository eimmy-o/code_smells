//Expense Management 
public class Expense {
    private String type;
    private double amount;

    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void generateReport() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
            System.out.println("Expense: " + expense.getType() + " - $" + expense.getAmount());

            if (expense.getType().equalsIgnoreCase("FutureInvestment")) {
                System.out.println("Classify as future investment");
            }
        }

        System.out.println("Total Expenses: $" + total);

        if (total > 1000) {
            System.out.println("Expenses exceed the monthly limit");
        }
    }
}
