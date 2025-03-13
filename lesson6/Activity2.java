package lesson6;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = sc.nextInt();
        System.out.println("Prime factor are: ");
        for (int div = 2; div * div <= number; div++) {
            while (number % div == 0) {
                number = number / div;
                System.out.println(div);

            }

        }
        if (number != 1) {
            System.out.println(number);

        }
        sc.close();
    }

}
