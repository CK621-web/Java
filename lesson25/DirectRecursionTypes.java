package lesson25;

import java.util.Scanner;

public class DirectRecursionTypes {
    public static int tailRecursion(int n, int result) {
        if (n == 0) {
            return result;

        }
        return tailRecursion(n - 1, result * n);
    }

    public static void headRecursion(int n) {
        if (n == 0) {
            return;
        }
        headRecursion(n - 1);
        System.out.println(n);
    }

    public static int treeRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return treeRecursion(n - 1) + treeRecursion(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tailRecursion(n, 1));

        headRecursion(n);

        System.out.println(treeRecursion(n));

        sc.close();
    }
}
