package Collection_ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManager {
    private ArrayList<String> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println(studentName + " has been added.");
    }

    // Method to remove a student
    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println(studentName + " has been removed.");
        } else {
            System.out.println(studentName + " is not found in the list.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student List:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("\n2. Remove Student");
            System.out.println("\n3. Display Students");
            System.out.println("\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    manager.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeStudent(nameToRemove);
                    break;
                case 3:
                    manager.displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
