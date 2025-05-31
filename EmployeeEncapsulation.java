public class Employee {
    private String name;
    private String employeeID;
    private double salary;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setEmployeeID(String id) { this.employeeID = id; }
    public String getEmployeeID() { return employeeID; }

    public double getSalary() { return salary; }

    public void updateSalary(double change) {
        if (salary + change >= 0) salary += change;
    }
}