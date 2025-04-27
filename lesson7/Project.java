package lesson7;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Enter the rotation count: ");
        int rotation = scanner.nextInt();

        int length = number.length();
        rotation = rotation % length;

        char[] digits = number.toCharArray();

        for (int i = 0; i < rotation; i++) {

            char last = digits[length - 1];

            for (int j = length - 1; j > 0; j--) {
                digits[j] = digits[j - 1];
            }

            digits[0] = last;
        }

        System.out.print("Rotated number: ");
        for (char digit : digits) {
            System.out.print(digit);
        }

        scanner.close();
    }
}
