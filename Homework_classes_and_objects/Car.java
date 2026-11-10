package Homework_classes_and_objects;

public class Car {
    String brand;
    int year;
    public Car(String brand, int year) {
        this.brand = brand;
        this. year = year;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void print() {
        System.out.println("Марка: " + brand + ", год выпуска: " + year);
    }
}
