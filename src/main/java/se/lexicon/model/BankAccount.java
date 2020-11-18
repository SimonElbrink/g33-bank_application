package se.lexicon.model;

import se.lexicon.sequencer.AccountNumberSequencer;

public class BankAccount {

    private final int accountNumber;
    private double balance;
    private BankClient client;

    public BankAccount(BankClient client) {
        this.client = client;
        this.balance = 0;
        this.accountNumber = AccountNumberSequencer.getNextId();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankClient getClient() {
        return client;
    }

    public void setClient(BankClient client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
