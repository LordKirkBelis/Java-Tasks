package homework_static_final_access_modifiers;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя: " + studentName + ", ID: " + studentID + ", университет: " + universityName);
    }

    public static void main(String[] args) {
        University student1 = new University(1, "Иван Иванов");
        University student2 = new University(1, "Иван Петров");
        University student3 = new University(1, "Иван Данилов");
        University.changeUniversityName("МГУ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }

}
