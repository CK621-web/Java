package lesson14.Activity2;

public class Main {

    // Write the complete Circle class definition, including instance variables and
    // method headers, to model a circle with a radius and providing methods to get
    // the radius, area, and circumference of the circle.
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
