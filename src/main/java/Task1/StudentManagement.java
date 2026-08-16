package Task1;

class Student {

    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentName = "Rushikesh";
        student1.rollNumber = 101;
        student1.branch = "Information Technology";
        student1.cgpa = 8.2;

        Student student2 = new Student();
        student2.studentName = "Amit";
        student2.rollNumber = 102;
        student2.branch = "Computer Engineering";
        student2.cgpa = 8.5;

        Student student3 = new Student();
        student3.studentName = "Priya";
        student3.rollNumber = 103;
        student3.branch = "Information Technology";
        student3.cgpa = 8.7;

        System.out.println("===== STUDENT INFORMATION =====");

        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
    }
}
