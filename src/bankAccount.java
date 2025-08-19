public class BankAccount {
    static String bankName = "LiceoBank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    private static int accountCounter = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    public static String generateAccountNumber() {
        return String.format("ACC%03d", accountCounter++);
    }
    
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName +
                " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}