package Homework_classes_and_objects;

public class Main_BankAccount {
    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount("Иван Иванов", 2000);
        bankAcount.deposit(500);
        bankAcount.withdraw(250);
        bankAcount.printBalance();
    }
}
