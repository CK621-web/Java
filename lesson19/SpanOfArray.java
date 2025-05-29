package lesson19;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        int span = max - min;

        System.out.println("span: " + span);

        sc.close();
    }
}