package lesson28;

import java.util.Scanner;

public class IndicesArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elemnts of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        System.out.println("Enter the number to find indices: ");
        int x = scn.nextInt();

        AllIndices(arr, n, x);
    }

    public static int AllIndexesRecursive(int[] input, int size, int x, int[] output) {4
        
        if (size == 0) {
            return 0;
        }

        int smallAns = AllIndexesRecursive(input, size - 1, x, output);
        if (input[size - 1] == x) {
            output[smallAns++] = size - 1;
        }
        return smallAns;
    }

    static void AllIndices(int[] input, int n, int x) {
        int[] output = new int[n];

        int size = AllIndexesRecursive(input, n, x, output);

        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
    }
}