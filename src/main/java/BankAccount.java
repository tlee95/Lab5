import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountType = accountCategory;
        ownerName = name;
        Bank.totalAccounts++;
        /*
         * Implement this function
         */
    }

    public void changeName (String name) {
        ownerName = name;
    }

    public boolean addBalance(double amount) {
        accountBalance += amount;
        return true;
    }

    public boolean withdrawBalance(double amount) {
        if ((accountBalance - amount) >= 0) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }


    /*
     * Implement getters and setters as appropriate for private variables.
     */
}