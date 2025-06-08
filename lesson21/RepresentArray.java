package lesson21;

import java.util.Scanner;

public class RepresentArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows:  ");
        int n = scn.nextInt();

        System.out.println("Enter the number of columns:  ");
        int m = scn.nextInt();

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
        scn.close();
    }
}
