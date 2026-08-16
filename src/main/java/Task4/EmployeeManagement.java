package Task4;

class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }
}

// Child class Developer
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: "
                + programmingLanguage);
    }
}

// Child class Manager
class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary,
            int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Developer developer = new Developer(
                "Rahul",
                101,
                60000,
                "Java"
        );

        Manager manager = new Manager(
                "Sneha",
                102,
                80000,
                10
        );

        System.out.println("===== DEVELOPER =====");
        developer.displayDeveloper();

        System.out.println("\n===== MANAGER =====");
        manager.displayManager();
    }
}