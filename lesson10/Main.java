package lesson10;

class Shape {
    public double getVolume() {
        return 0.0;
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}

class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5.0);
        Cuboid cuboid = new Cuboid(4.0, 6.0, 3.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);

        System.out.println("Volume of Cube: " + cube.getVolume() + " cubic units");
        System.out.println("Volume of Cuboid: " + cuboid.getVolume() + " cubic units");
        System.out.println("Volume of Cylinder: " + cylinder.getVolume() + " cubic units");

        Shape shape1 = new Cube(7.0);
        Shape shape2 = new Cylinder(2.5, 10.0);
        System.out.println("\nVolume of another Cube (via Shape reference): " + shape1.getVolume() + " cubic units");
        System.out.println("Volume of another Cylinder (via Shape reference): " + shape2.getVolume() + " cubic units");
    }
}