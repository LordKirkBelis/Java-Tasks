package Homework_classes_and_objects;

public class Main_Product {
    public static void main(String[] args) {
        Product product = new Product("Пылесос", 6500);
        product.setPrice(6000);
        product.applyDiscount(20);
        product.printInfo();
    }
}
