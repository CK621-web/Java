package lesson19;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInverter {

    public static int[] inverseArray(int[] originalArray) {
        if (originalArray == null || originalArray.length == 0) {
            return new int[0];
        }

        int n = originalArray.length;
        int[] reversedArray = new int[n];

        for (int i = 0; i < n; i++) {
            reversedArray[i] = originalArray[n - 1 - i];
        }

        return reversedArray;
    }

    public static void inverseArrayInPlace(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the size of the array (n): ");
            int n;
            try {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Array size cannot be negative. Exiting.");
                    return;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer for array size. Exiting.");
                return;
            }

            int[] a = new int[n];
            System.out.println("Enter " + n + " integer elements for the array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                try {
                    a[i] = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer. Exiting.");
                    return;
                }
            }

            System.out.println("\nOriginal Array: " + Arrays.toString(a));

            int[] inverseA = inverseArray(a);
            System.out.println("Inverse (Reversed) Array (new array): " + Arrays.toString(inverseA));

            int[] aCopyForInPlace = Arrays.copyOf(a, a.length);
            inverseArrayInPlace(aCopyForInPlace);
            System.out.println("Inverse (Reversed) Array (in-place): " + Arrays.toString(aCopyForInPlace));

        }
    }
}
