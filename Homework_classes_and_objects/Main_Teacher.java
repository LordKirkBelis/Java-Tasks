package Homework_classes_and_objects;

public class Main_Teacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Иванов", "Алгебра");
        teacher.setSubject("Геометрия");
        teacher.printInfo();
    }
}
