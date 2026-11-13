package homework_static_final_access_modifiers;

public class Person {
    private String firsName;
    private String lastName;
    private final String ssn;

    Person(String firsName, String lastName, String ssn) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirsName() {
        return firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSsn() {
        return ssn;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void printPersonInfo() {
        System.out.println("Имя: " + firsName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person object1 = new Person("Иван", "Иванов", "123-45-6789");
        Person object2 = new Person("Владимир", "Петров", "123-25-6339");
        Person object3 = new Person("Олег", "Журов", "333-45-7777");

        object2.setFirsName("Кирилл");
        object2.setLastName("Белов");

        object1.printPersonInfo();
        object2.printPersonInfo();
        object3.printPersonInfo();
    }
}
