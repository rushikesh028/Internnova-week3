package Task5;

class Calculator {

    // Method Overloading - 2 integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method Overloading - 2 doubles
    double calculate(double a, double b) {
        return a + b;
    }

    // Method Overloading - 3 integers
    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

// Parent class
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Child class Car
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Child class Bike
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("===== METHOD OVERLOADING =====");

        Calculator calculator = new Calculator();

        System.out.println("calculate(10, 20): "
                + calculator.calculate(10, 20));

        System.out.println("calculate(10.5, 20.5): "
                + calculator.calculate(10.5, 20.5));

        System.out.println("calculate(10, 20, 30): "
                + calculator.calculate(10, 20, 30));

        System.out.println("\n===== METHOD OVERRIDING =====");

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}
