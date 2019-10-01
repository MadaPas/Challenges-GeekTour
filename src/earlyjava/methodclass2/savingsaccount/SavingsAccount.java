package earlyjava.methodclass2.savingsaccount;

class SavingsAccount {
    private double interestRate, balance;

    public SavingsAccount(double b) {
        balance = b;
    }

    public void setInterestRate(double i) {
        interestRate = i / 12 / 100;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }

    public void deposit(double d) {
        balance += d;
    }

    public void withdraw(double w) {
        balance -= w;
    }

    public double getBalance() {
        return balance;
    }
}
