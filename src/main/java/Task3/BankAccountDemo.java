package Task3;

class BankAccount {

    String accountHolderName;
    long accountNumber;
    double balance;

    static int totalAccounts = 0;

    // Parameterized constructor
    BankAccount(String accountHolderName, long accountNumber,
                double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("-------------------------");
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
                "Rushikesh", 10001, 25000
        );

        BankAccount account2 = new BankAccount(
                "Amit", 10002, 35000
        );

        BankAccount account3 = new BankAccount(
                "Priya", 10003, 45000
        );

        System.out.println("===== BANK ACCOUNT DETAILS =====");

        account1.displayAccount();
        account2.displayAccount();
        account3.displayAccount();

        System.out.println("Total Number of Accounts: "
                + BankAccount.totalAccounts);
    }
}