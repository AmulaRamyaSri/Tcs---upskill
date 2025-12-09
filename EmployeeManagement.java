import java.util.*;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = getBaseSalary(designation);
    }

    private double getBaseSalary(String designation) {
        switch (designation.toLowerCase()) {
            case "product manager":
                return 20000;
            case "manager":
                return 25000;
            case "tester":
                return 15000;
            default:
                return 0;
        }
    }

    void raiseSalary(int percentage) {
        salary += salary * percentage / 100.0;
    }
}

public class EmployeeManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: createEmployee(); break;
                case 2: displayEmployees(); break;
                case 3: raiseSalary(); break;
                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void createEmployee() {
        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            for(int i=0;i<name.length();i++)
            {
            	char c = name.charAt(i);
            	if(Character.isDigit(c))
            	{
            		System.out.println("No digits are allowed in name");
            	}
            	continue;
            }
            if (name.trim().split("\\s+").length > 3) {
                System.out.println("Invalid name! More than 2 white spaces.");
                continue;
            }

            System.out.print("Enter age (20-60): ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age < 20 || age > 60) {
                System.out.println("Invalid age! Must be 20–60.");
                continue;
            }

            System.out.print("Enter designation (Product Manager / Manager / Tester): ");
            String designation = sc.nextLine();

            Employee emp = new Employee(name, age, designation);
            employees.add(emp);

            System.out.print("Do you want to enter another employee? (y/n): ");
            char next = sc.next().charAt(0);
            sc.nextLine();

            if (next == 'n' || next == 'N') break;
        }
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display!");
            return;
        }

        System.out.println("\n=== Employee Details ===");
        for (Employee e : employees) {
            System.out.println("-------------------------");
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Designation: " + e.designation);
            System.out.println("Salary: " + e.salary);
        }
    }

    static void raiseSalary() {
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        Employee found = null;
        for (Employee e : employees) {
            if (e.name.equalsIgnoreCase(name)) {
                found = e;
                break;
            }
        }

        if (found == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.print("Enter percentage to increase (1-10): ");
        int percent = sc.nextInt();
        sc.nextLine();

        if (percent < 1 || percent > 10) {
            System.out.println("Invalid percentage!");
            return;
        }

        found.raiseSalary(percent);
        System.out.println("Salary updated successfully!");
    }
}

