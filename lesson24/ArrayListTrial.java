package lesson24;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the size of the array of lines: " + (i + 1));
            int n1 = sc.nextInt();

            ArrayList<Integer> l2 = new ArrayList<>();
            System.out.println("Enter the numbers for line " + (i + 1));

            for (int j = 0; j < n1; j++) {
                l2.add(sc.nextInt());
            }
            list.add(i, l2);
        }
        System.out.println("enter the number of queries:");
        int num = sc.nextInt();

        for (int k = 0; k < num; k++) {
            System.out.println("Enter the no. of row and columns:");

            int r = sc.nextInt();
            int c = sc.nextInt();

            try {
                System.out.println("Element at row" + r + " and column " + c + " = " + list.get(r - 1).get(c - 1));

            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
}