package edu.wctc;

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
}
