// Base class
class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// Derived class 1
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

// Derived class 2
class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car Actions:");
        car.startEngine();
        car.drive();
        car.stopEngine();

        System.out.println();

        Motorcycle bike = new Motorcycle();
        System.out.println("Motorcycle Actions:");
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}
