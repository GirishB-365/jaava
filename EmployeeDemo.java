import java.util.Scanner;

// Base class
class Employee {
    public void work() {
        System.out.println("Employee is working...");
    }

    public double getSalary() {
        return 30000.0; // base salary
    }
}

// Subclass
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks...");
    }

    public void conductInterview() {
        System.out.println("HR Manager is conducting interviews.");
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.conductInterview();
        System.out.println("Salary: $" + hr.getSalary());
    }
}
