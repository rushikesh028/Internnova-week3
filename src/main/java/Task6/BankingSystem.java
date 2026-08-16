package Task6;

// Abstract class
abstract class Account {

    // Abstract method
    abstract void calculateInterest();

    // Normal method
    void displayBankName() {
        System.out.println("Bank Name: ABC Bank");
    }
}

// Child class
class SavingsAccount extends Account {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    SavingsAccount(long accountNumber,
                   String accountHolderName,
                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Implementing abstract method
    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest at 5%: ₹" + interest);
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(
                10001,
                "Rushikesh",
                50000
        );

        System.out.println("===== BANKING SYSTEM =====");

        account.displayBankName();

        System.out.println("\nAccount Details:");
        account.displayAccount();

        System.out.println();
        account.calculateInterest();

        System.out.println("\nUpdated Balance:");
        account.setBalance(55000);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}