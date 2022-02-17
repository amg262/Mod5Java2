package edu.wctc;

public class NegativeDepositException extends Exception {


    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public NegativeDepositException(double amount) {
        super("Deposit cannot be negative: " + amount);
    }
}
