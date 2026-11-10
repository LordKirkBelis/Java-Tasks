package Homework_classes_and_objects;

public class BankAcount {
    String owner;
    double balance;

    public BankAcount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void printBalance() {
        System.out.println("Баланс: " + balance);
    }
}
