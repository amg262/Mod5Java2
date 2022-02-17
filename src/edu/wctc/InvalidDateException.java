package edu.wctc;

public class InvalidDateException extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public InvalidDateException(int year, int month, int day) {
        super(String.format("%d/%d/%d is not a valid date", month, day, year));
    }
}
