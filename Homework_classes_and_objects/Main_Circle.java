package Homework_classes_and_objects;

public class Main_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(50);
        circle.setRadius(30);
        System.out.println("Площадь: " + circle.calculateArea() + ", длина окружности: " + circle.calculateCircumference());
    }
}
