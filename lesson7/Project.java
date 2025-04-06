package lesson7;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        // Input rotation count
        System.out.print("Enter the rotation count: ");
        int rotation = scanner.nextInt();

        int length = number.length();
        rotation = rotation % length; // Normalize the rotation

        char[] digits = number.toCharArray();

        // Rotate right by rotation using loop
        for (int i = 0; i < rotation; i++) {
            // Save last character
            char last = digits[length - 1];

            // Shift all characters to the right
            for (int j = length - 1; j > 0; j--) {
                digits[j] = digits[j - 1];
            }

            // Put last character in the front
            digits[0] = last;
        }

        // Print the rotated number
        System.out.print("Rotated number: ");
        for (char digit : digits) {
            System.out.print(digit);
        }

        scanner.close();
    }
}
