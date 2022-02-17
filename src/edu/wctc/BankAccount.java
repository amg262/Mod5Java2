package edu.wctc;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0)
            throw new NegativeDepositException(amount);
        balance += amount;
    }
}
