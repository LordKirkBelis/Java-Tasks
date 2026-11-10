package Homework_classes_and_objects;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double discount) {
        price = price - (price * discount / 100);
    }
    public void printInfo() {
        System.out.println("Товар: " + name + ", цена: " + price);
    }
}
