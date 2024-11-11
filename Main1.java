import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee emp = new Employee(id, name, position, department, salary);
                    manager.addEmployee(emp);
                    break;
                case 2:
                    System.out.print("Enter ID to Update: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Position: ");
                    position = scanner.nextLine();
                    System.out.print("Enter New Department: ");
                    department = scanner.nextLine();
                    System.out.print("Enter New Salary: ");
                    salary = scanner.nextDouble();
                    manager.updateEmployee(id, name, position, department, salary);
                    break;
                case 3:
                    System.out.print("Enter ID to Delete: ");
                    id = scanner.nextInt();
                    manager.deleteEmployee(id);
                    break;
                case 4:
                    manager.displayEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
