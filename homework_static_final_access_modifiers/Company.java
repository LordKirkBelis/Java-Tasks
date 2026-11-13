package homework_static_final_access_modifiers;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void printInfo() {
        System.out.println("Название компании: " + companyName + ", имя сотрудника: " + employeeName + ", ID:  " + employeeID);
    }

    public static void main(String[] args) {
        Company h1 = new Company(1,"Иван Иванов");
        Company h2 = new Company(2,"Пётор Петров");
        Company h3 = new Company(3, "Кирил Кириллов");

        Company.companyName = "Google";
        h1.printInfo();
        h2.printInfo();
        h3.printInfo();

    }
}
