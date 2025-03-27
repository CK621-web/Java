package lesson9;

class Vehicle {
    String brand;
    String name = "Vehicle";

    public Vehicle(String brand) {
        this.brand = brand;

    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }

}

class Car extends Vehicle {
    String model;
    int year;
    String name = "Car";

    public Car(String brand, String model, int year) {

        super(brand);
        this.model = model;
        this.year = year;

    }

    @Override
    public void displayInfo() {
        System.out.println("car's Name: " + name);
        System.out.println("Vehicles name: " + super.name);
        super.displayInfo();
        System.out.println("Model: " + model + "Year: " + year);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Car c1 = new Car("lambo ", "aventador ", 2009);
        c1.displayInfo();

    }
}