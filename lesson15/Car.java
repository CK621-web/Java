package lesson15;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String make, String model, int year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

}
