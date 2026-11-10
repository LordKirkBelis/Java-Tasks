package Homework_classes_and_objects;

public class Main_Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setWidth(6);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
    }
}
