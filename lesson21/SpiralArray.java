package lesson21;

import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows:  ");
        int n = scn.nextInt();

        System.out.println("Enter the number of columns:  ");
        int m = scn.nextInt();

        if (n == 0 || m == 0) {
            System.out.println("Array dimensions cannot be zero.");
            return;
        }

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();

            }
        }

        System.out.println("The entered 2d array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rmin = 0, cmin = 0, rmax = n - 1, cmax = n - 1;
        int count = 0;

        System.out.println("Spiral order transversal of the Array: ");
        while (count < n * m) {
            for (int col = cmin; col <= cmax && count < n * m; col++) {
                System.out.print(arr[rmin][col] + " ");
                count++;
            }
            rmin++;

            for (int row = rmin; row <= rmax && count < n * m; row++) {
                System.out.print(arr[row][cmax] + " ");
                count++;
            }
            cmax--;

            for (int col = cmax; col >= cmin && count < n * m; col--) {
                System.out.print(arr[rmax][col] + " ");
                count++;
            }
            rmax--;

            for (int row = rmax; row >= rmin && count < n * m; row--) {
                System.out.print(arr[row][cmin] + " ");
                count++;
            }
            cmin++;
        }
        scn.close();
    }
}
