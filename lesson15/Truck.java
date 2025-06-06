package lesson15;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("The Truck is driving");
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}
