package lesson20;

import java.util.Scanner;

public class KConcatenatedMaxSubarray {

    // Standard Kadane's Algorithm
    public static long kadane(int[] arr) {
        long maxEndingHere = arr[0];
        long maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // Modified for K concatenations
    public static long kConcatenationMaxSum(int[] arr, int k) {
        long kadaneOne = kadane(arr); // Max subarray in single array

        if (k == 1)
            return kadaneOne;

        // Total sum of one copy
        long totalSum = 0;
        for (int num : arr)
            totalSum += num;

        // Make array with 2 copies to handle wrap-around
        int[] doubleArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i];
            doubleArr[i + arr.length] = arr[i];
        }

        long kadaneTwo = kadane(doubleArr); // Max subarray in 2 copies

        if (totalSum > 0) {
            return kadaneTwo + (k - 2) * totalSum;
        } else {
            return kadaneTwo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array A: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        long result = kConcatenationMaxSum(A, k);
        System.out.println("Maximum subarray sum in K-concatenated array: " + result);
    }
}
