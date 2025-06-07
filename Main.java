import java.util.Scanner;

// Base class
class Vehicle {
    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

// Subclass
class Car extends Vehicle {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        Car myCar = new Car(brand, model);
        myCar.drive();
        myCar.display();
    }
}
