/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /** Bank account types. */
    public enum BankAccountType {
        /** A checking account. */
        CHECKINGS,

        /** A savings account. */
        SAVINGS,

        /** A student account. */
        STUDENT,

        /** A workplace account. */
        WORKPLACE
    }

    /** The number of the account. */
    private int accountNumber;

    /** The type of the account. */
    private BankAccountType accountType;

    /** The balance of the account. */
    private double accountBalance;

    /** The owner of the account. */
    private String ownerName;

    /** The interest rate of the account. */
    private double interestRate;

    /** The interest earned from the account. */
    private double interestEarned;

    /**
     * BankAccount constructor.
     *
     * @param name Account owner name
     * @param accountCategory category of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        Bank.totalAccounts++;
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * Set function for owner name.
     *
     * @param newOwnerName New account owner name
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     * Deposit money into the account.
     *
     * @param amount Amount to deposit
     * @return true if the deposit was successful, false if deposit fails
     */
    public boolean deposit(final double amount) {
        if (amount < 0) {
            return false;
        }
        accountBalance += amount;
        return true;
    }

    /**
     * Withdraw money from the account.
     *
     * @param amount Amount to withdraw
     * @return true if the withdrawing was successful, false if it fails
     */
    public boolean widthdraw(final double amount) {
        if (amount > accountBalance) {
            return false;
        }
        accountBalance -= amount;
        return true;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Get account type.
     *
     * @return Account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Get account type.
     *
     * @return Account type
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Get account type.
     *
     * @return Account type
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Get account type.
     *
     * @return Account type
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Get account type.
     *
     * @return Account type
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get account type.
     *
     * @return Account type
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set account balance.
     *
     * @param naccountBalance account balance to set
     */
    public void setAccountBalance(final double naccountBalance) {
        this.accountBalance = naccountBalance;
    }

    /**
     * Set account balance.
     *
     * @param naccountNumber account balance to set
     */
    public void setAccountNumber(final int naccountNumber) {
        this.accountNumber = naccountNumber;
    }

    /**
     * Set account balance.
     *
     * @param naccountType account balance to set
     */
    public void setAccountType(final BankAccountType naccountType) {
        this.accountType = naccountType;
    }

    /**
     * Set account balance.
     *
     * @param ninterestEarned account balance to set
     */
    public void setInterestEarned(final double ninterestEarned) {
        this.interestEarned = ninterestEarned;
    }

    /**
     * Set account interest rate.
     *
     * @param ninterestRate account interest rate to set
     */
    public void setInterestRate(final double ninterestRate) {
        this.interestRate = ninterestRate;
    }
}
