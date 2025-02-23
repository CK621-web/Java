
package lesson3;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        System.out.println("the perimeter of the triangle is: " + perimeter);
        sc.close();

    }

}
