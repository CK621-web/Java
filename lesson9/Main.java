package lesson9;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +  -  *  /");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Result: " + Addition.add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + Subtraction.subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + Multiplication.multiply(num1, num2));
                break;
            case "/":
                try {
                    System.out.println("Result: " + Division.divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        scanner.close();
    }
}

class Addition {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction {
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication {
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}

class Division {
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
