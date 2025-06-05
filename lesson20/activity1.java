package lesson20;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

        int currentSum = a[0];
        int maxSum = a[0];

        for (int i = 1; i < n; i++) {
            if ((currentSum + a[i]) > a[i]) {
                currentSum = currentSum + a[i];
            } else {
                currentSum = a[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println();
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
