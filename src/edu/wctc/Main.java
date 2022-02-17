package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }

    static void bankAccountDemo() {
        BankAccount acct = new BankAccount();
        try {
            acct.deposit(-1);
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
        }
    }

    static LocalDate checkIfValidDate(int year, int month, int day) throws InvalidDateException {

        try {
            LocalDate date = LocalDate.of(year, month, day);
            return date;
        } catch (DateTimeException dte) {
            throw new InvalidDateException(year, month, day);
        }
    }
}
