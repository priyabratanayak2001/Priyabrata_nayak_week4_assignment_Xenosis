package Collection_ExceptionHandling;

import java.util.HashMap;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeManager {
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    // Method to add an employee
    public void addEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        employeeMap.put(id, employee);
        System.out.println("Employee " + name + " added with ID " + id);
    }

    // Method to get employee details by ID
    public void getEmployeeDetails(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println(employee.getDetails());
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Get Employee Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String department = scanner.nextLine();
                    manager.addEmployee(id, name, department);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to retrieve: ");
                    int idToRetrieve = scanner.nextInt();
                    manager.getEmployeeDetails(idToRetrieve);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
