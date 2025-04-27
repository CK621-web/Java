package lesson15;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Audi-84", 2023, 4);
        car.drive();

        Truck truck = new Truck("Toyota", "Toyota-54", 2021, 4500);
        truck.drive();
    }
}
