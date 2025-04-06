package lesson6;

import java.util.Scanner;
import java.util.scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + N + ":");

        while (first <= N) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
