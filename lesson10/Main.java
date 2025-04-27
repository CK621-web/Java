package lesson10;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        myShape.draw(); // Calls Shape's draw()
        myShape.draw("Red"); // Calls overloaded draw(String color)

        System.out.println(); // Just a blank line for clarity

        Circle myCircle = new Circle();
        myCircle.draw(); // Calls Circle's overridden draw()
        myCircle.draw("Blue"); // Still uses Shape's overloaded draw(String color)
    }
}

class Circle extends Shape {
    // Overriding the draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Shape {
    // Method 1: No-parameter draw method
    public void draw() {
        System.out.println("Drawing a shape...");
    }

    // Method 2: Overloaded draw method with a color
    public void draw(String color) {
        System.out.println("Drawing a shape with color: " + color);
    }
}
