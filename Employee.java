public class Employee {
    private int id;
    private String name;
    private String position;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String position, String department, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Position: " + position +
               ", Department: " + department + ", Salary: $" + salary;
    }
}