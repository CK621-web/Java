interface Shape {
    public double getArea();
}

class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;

    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double sumArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

public class AreaCalculatorMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(3, 6);
        shapes[1] = new Circle(2.5);

        AreaCalculator areaCalculator = new AreaCalculator();
        double totalArea = areaCalculator.sumArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}