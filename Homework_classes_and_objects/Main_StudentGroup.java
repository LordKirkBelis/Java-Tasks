package Homework_classes_and_objects;

public class Main_StudentGroup {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("Звездочка", 15);
        studentGroup.setStudentCount(10);
        studentGroup.printInfo();
    }
}
