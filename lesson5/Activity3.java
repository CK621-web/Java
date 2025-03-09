package lesson5;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number;
        char c;
        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
            System.out.println("Do you want to continue? (y/n)");
            c = sc.next().charAt(0);

        } while (c == 'y' || c == 'Y');
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        sc.close();

    }

}
