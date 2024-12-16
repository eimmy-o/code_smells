//Banking System
public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public void withdraw(double amount) { balance -= amount; }
}

public class Transaction {
    private BankAccount bankAccount;

    public void processTransaction() {
        if (bankAccount.getBalance() > 5000) {
            bankAccount.withdraw(500); 
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
