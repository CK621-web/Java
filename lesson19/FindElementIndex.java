package lesson19;

import java.util.Scanner;

public class FindElementIndex {
    public static void printArray(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the distinct elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printArray(a, n);

        System.out.print("Enter the number to search: ");
        int d = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == d) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + d + ": " + index);
        sc.close();
    }
}
