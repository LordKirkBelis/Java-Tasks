package Homework_classes_and_objects;

public class Main_Book {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Толстой");
        book.setAuthor("Пушкин");
        book.printInfo();
    }
}
